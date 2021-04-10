(ns reagent-material-ui.core.textarea-autosize
  "Imports @material-ui/core/TextareaAutosize as a Reagent component.
   Original documentation is at https://material-ui.com/api/textarea-autosize/ ."
  (:require-macros [reagent-material-ui.util :refer [forward-ref]])
  (:require ["react" :as react]
            ["@material-ui/core/utils" :as mui-utils]
            [reagent.core :as r :refer [atom]]
            [goog.object :as obj]
            [reagent-material-ui.util :refer [adapt-react-class js->clj' remove-undefined-vals use-fork-ref
                                              use-callback use-effect use-ref use-state set-ref swap-ref]]))

;; Converted from https://github.com/mui-org/material-ui/blob/v4.8.3/packages/material-ui/src/TextareaAutosize/TextareaAutosize.js
;; Original code is copyright (c) Material UI contributors. Used under the terms of the MIT License.

(defn ^:private different? [a b]
  (< 1 (.abs js/Math (- (or a 0) (or b 0)))))

(defn ^:private get-style-value [computed-style property]
  (or (js/parseInt (obj/get computed-style property) 10) 0))

(def react-textarea-autosize
  (forward-ref textarea-autosize [props ref]
    (let [props (js->clj' props)
          {:keys [on-change placeholder max-rows min-rows style value] :or {min-rows 1}} props
          other-props (dissoc props :input-ref :on-change :max-rows :min-rows :style)
          controlled? (.-current (use-ref (some? value)))
          input-ref (use-ref nil)
          shadow-ref (use-ref nil)
          renders (use-ref 0)
          handle-ref (use-fork-ref (:input-ref props) input-ref ref)
          [state set-state] (use-state {})
          sync-height (use-callback #(let [input (.-current input-ref)
                                           container-window (mui-utils/ownerWindow input)
                                           shadow (.-current shadow-ref)
                                           computed-style (.getComputedStyle container-window input)]
                                       (when-not (zero? (get-style-value computed-style "width"))
                                         (set! (.-width (.-style shadow)) (obj/get computed-style "width"))
                                         (set! (.-value shadow) (or (.-value input) placeholder "x"))
                                         (when (= (last (.-value shadow)) \newline)
                                           (set! (.-value shadow) (str (.-value shadow) " ")))
                                         (let [box-sizing (obj/get computed-style "box-sizing")
                                               padding (+ (get-style-value computed-style "padding-bottom")
                                                          (get-style-value computed-style "padding-top"))
                                               border (+ (get-style-value computed-style "border-bottom-width")
                                                         (get-style-value computed-style "border-top-width"))
                                               inner-height (.-scrollHeight shadow)
                                               _ (set! (.-value shadow) "x")
                                               single-row-height (.-scrollHeight shadow)
                                               outer-height (cond-> inner-height
                                                              min-rows (max (* (js/Number. min-rows) single-row-height))
                                                              max-rows (min (* (js/Number. max-rows) single-row-height))
                                                              true (max single-row-height))
                                               outer-height-style (if (= "border-box" box-sizing)
                                                                    (+ outer-height padding border)
                                                                    outer-height)
                                               overflow? (not (different? outer-height inner-height))]
                                           (set-state (fn [prev-state]
                                                        (if (and (< (.-current renders) 20)
                                                                 (or (and (pos? outer-height-style)
                                                                          (different? (:outer-height-style prev-state) outer-height-style))
                                                                     (not= overflow? (:overflow? prev-state))))
                                                          (do
                                                            (swap-ref renders inc)
                                                            {:overflow?          overflow?
                                                             :outer-height-style outer-height-style})
                                                          (do
                                                            (when (and (or (not (exists? js/process))
                                                                           (not= "production" (.. js/process -env -NODE_ENV)))
                                                                       (= (.-current renders) 20))
                                                              (.error js/console "Material-UI: too many re-renders. The layout is unstable.\nTextareaAutosize limits the number of renders to prevent an infinite loop"))
                                                            prev-state)))))))
                                    #js [max-rows min-rows placeholder])
          handle-change (fn [e]
                          (set-ref renders 0)
                          (when-not controlled?
                            (sync-height))
                          (when on-change
                            (on-change e)))]
      (use-effect #(let [handle-resize (mui-utils/debounce (fn []
                                                             (set-ref renders 0)
                                                             (sync-height)))
                         container-window (mui-utils/ownerWindow (.-current input-ref))]
                     (.addEventListener container-window "resize" handle-resize)
                     (fn []
                       (.clear handle-resize)
                       (.removeEventListener container-window "resize" handle-resize)))
                  #js [sync-height])
      (mui-utils/unstable_useEnhancedEffect sync-height)
      (use-effect #(set-ref renders 0)
                  #js [value])
      (r/as-element
       [:<>
        [:textarea (remove-undefined-vals
                    (merge {:on-change handle-change
                            :ref       handle-ref
                            :rows      min-rows
                            :style     (merge {:height   (:outer-height-style state)
                                               :overflow (when (:overflow? state) :hidden)}
                                              style)}
                           other-props))]
        [:textarea {:aria-hidden true
                    :class-name  (:class-name props)
                    :read-only   true
                    :ref         shadow-ref
                    :tab-index   -1
                    :style       (merge {:visibility :hidden
                                         :position   :absolute
                                         :overflow   :hidden
                                         :height     0
                                         :top        0
                                         :left       0
                                         :transform  "translateZ(0)"}
                                        style
                                        {:padding 0})}]]))))

(def textarea-autosize (adapt-react-class react-textarea-autosize))
