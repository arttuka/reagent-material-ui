(ns reagent-mui.material.text-field
  "Imports @mui/material/TextField as a Reagent component.
   Original documentation is at https://mui.com/api/text-field/ ."
  (:require-macros [reagent-mui.util :refer [forward-ref]])
  (:require [react :as react]
            [reagent.core :as r]
            ["@mui/material/TextField" :as MuiTextField]
            [reagent-mui.material.textarea-autosize :refer [react-textarea-autosize]]
            [reagent-mui.util :refer [adapt-react-class get-anycase assoc-anycase js->clj' remove-undefined-vals]]))

;; Fix cursor positioning for Reagent
;; https://github.com/reagent-project/reagent/blob/v1.1.0/doc/examples/material-ui.md

(defn ^:private input-props [props ref]
  (-> (js->clj' props)
      (assoc :ref ref)
      (remove-undefined-vals)))

(def ^:private input
  (forward-ref input [props ref]
    (r/as-element [:input (input-props props ref)])))

(def ^:private textarea
  (forward-ref textarea [props ref]
    (r/as-element [:textarea (input-props props ref)])))

(def ^:private mui-text-field (adapt-react-class (.-default MuiTextField) "mui-text-field"))

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
