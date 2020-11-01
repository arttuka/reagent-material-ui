(ns reagent-material-ui.core.text-field
  "Imports @material-ui/core/TextField as a Reagent component.
   Original documentation is at https://material-ui.com/api/text-field/ ."
  (:require-macros [reagent-material-ui.util :refer [forward-ref]])
  (:require [react :as react]
            [reagent.core :as r]
            ["@material-ui/core/TextField" :as MuiTextField]
            [reagent-material-ui.core.textarea-autosize :refer [react-textarea-autosize]]
            [reagent-material-ui.util :refer [adapt-react-class get-anycase assoc-anycase js->clj']]))

;; Fix cursor positioning for Reagent
;; https://github.com/reagent-project/reagent/blob/master/doc/examples/material-ui.md

(def ^:private input
  (forward-ref input [props ref]
    (r/as-element [:input (assoc (js->clj' props) :ref ref)])))

(def ^:private textarea
  (forward-ref textarea [props ref]
    (r/as-element [:textarea (assoc (js->clj' props) :ref ref)])))

(def ^:private mui-text-field (adapt-react-class (or (.-default MuiTextField) (.-TextField MuiTextField)) "mui-text-field"))

(defn text-field [props & children]
  (let [min-rows (get-anycase props :min-rows)
        max-rows (get-anycase props :max-rows)
        autosize? (and (:multiline props) (not (:rows props)))
        input-component (or (get-anycase (:InputProps props) :input-component)
                            (cond
                              autosize? react-textarea-autosize
                              (:multiline props) textarea
                              (:select props) nil
                              :else input))
        props (cond-> props
                input-component (update :InputProps #(assoc-anycase % :input-component input-component))
                autosize? (update :input-props merge {:max-rows max-rows
                                                      :min-rows min-rows}))]
    (into [mui-text-field props] children)))
