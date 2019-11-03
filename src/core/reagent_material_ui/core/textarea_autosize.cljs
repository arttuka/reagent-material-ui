(ns reagent-material-ui.core.textarea-autosize
  "Imports @material-ui/core/TextareaAutosize as a Reagent component.
   Original documentation is at https://material-ui.com/api/textarea-autosize/ ."
  (:require-macros [reagent-material-ui.macro :refer [forward-ref]])
  (:require [reagent.core :as r :refer [atom]]
            [goog.object :as obj]
            [reagent-material-ui.util :refer [adapt-react-class debounce js->clj' remove-undefined-vals use-fork-ref
                                              use-callback use-effect use-layout-effect use-ref use-state]]))

;; Converted from https://github.com/mui-org/material-ui/blob/v4.5.1/packages/material-ui/src/TextareaAutosize/TextareaAutosize.js
;; Original code is copyright (c) Material UI contributors. Used used under the terms of the MIT License.

(defn ^:private different? [a b]
  (< 1 (.abs js/Math (- (or a 0) (or b 0)))))

(defn ^:private get-style-value [computed-style property]
  (or (js/parseInt (obj/get computed-style property) 10) 0))

(def react-textarea-autosize
  (forward-ref textarea-autosize [props ref]
    (let [props (js->clj' props)
          {:keys [on-change placeholder rows rows-max style value]} props
          other-props (dissoc props :input-ref :on-change :rows :rows-max :style)
          controlled? (some? value)
          ^js/React.Ref input-ref (use-ref nil)
          ^js/React.Ref shadow-ref (use-ref nil)
          handle-ref (use-fork-ref (:input-ref props) input-ref ref)
          [state set-state] (use-state {})
          sync-height (use-callback #(let [input (.-current input-ref)
                                           shadow (.-current shadow-ref)
                                           computed-style (.getComputedStyle js/window input)
                                           _ (set! (.-width (.-style shadow)) (obj/get computed-style "width"))
                                           _ (set! (.-value shadow) (or (.-value input) placeholder "x"))
                                           box-sizing (obj/get computed-style "box-sizing")
                                           padding (+ (get-style-value computed-style "padding-bottom")
                                                      (get-style-value computed-style "padding-top"))
                                           border (+ (get-style-value computed-style "border-bottom-width")
                                                     (get-style-value computed-style "border-top-width"))
                                           inner-height (- (.-scrollHeight shadow) padding)
                                           _ (set! (.-value shadow) "x")
                                           single-row-height (- (.-scrollHeight shadow) padding)
                                           outer-height (cond-> inner-height
                                                          rows (max (* (js/Number. rows) single-row-height))
                                                          rows-max (min (* (js/Number. rows-max) single-row-height))
                                                          true (max single-row-height))
                                           outer-height (if (= "border-box" box-sizing)
                                                          (+ outer-height padding border)
                                                          outer-height)
                                           overflow? (not (different? outer-height inner-height))]
                                       (set-state (fn [prev-state]
                                                    (if (or (and (pos? outer-height)
                                                                 (different? (:height prev-state) outer-height))
                                                            (not= overflow? (:overflow? prev-state)))
                                                      {:overflow? overflow?
                                                       :height    outer-height}
                                                      prev-state))))
                                    #js [rows rows-max placeholder])
          handle-change (fn [e]
                          (when-not controlled?
                            (sync-height))
                          (when on-change
                            (on-change e)))]
      (use-effect #(let [handle-resize (debounce sync-height 166)]
                     (.addEventListener js/window "resize" handle-resize)
                     (fn []
                       (.clear handle-resize)
                       (.removeEventListener js/window "resize" handle-resize)))
                  #js [sync-height])
      (use-layout-effect sync-height)
      (r/as-element
       [:<>
        [:textarea (remove-undefined-vals
                    (merge {:on-change handle-change
                            :ref       handle-ref
                            :rows      (or rows 1)
                            :style     (merge {:height   (:height state)
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
                                        style)}]]))))

(def textarea-autosize (adapt-react-class react-textarea-autosize))
