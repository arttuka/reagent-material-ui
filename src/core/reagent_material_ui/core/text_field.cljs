(ns reagent-material-ui.core.text-field
  "Imports @material-ui/core/TextField as a Reagent component.
   Original documentation is at https://material-ui.com/api/text-field/ ."
  (:require [reagent.core :as r]
            [material-ui]
            [reagent-material-ui.core.textarea-autosize :refer [react-textarea-autosize]]
            [reagent-material-ui.util :refer [adapt-react-class get-anycase assoc-anycase remove-undefined-vals]]))

;; Fix cursor positioning for Reagent
;; https://github.com/reagent-project/reagent/blob/master/doc/examples/material-ui.md

(def ^:private input
  (r/reactify-component
   (fn input [props]
     [:input (-> props
                 (assoc :ref (:inputRef props))
                 (dissoc :inputRef)
                 (remove-undefined-vals))])))

(def ^:private textarea
  (r/reactify-component
   (fn textarea [props]
     [:textarea (-> props
                    (assoc :ref (:inputRef props))
                    (dissoc :inputRef)
                    (remove-undefined-vals))])))

(def ^:private mui-text-field (adapt-react-class (.-TextField js/MaterialUI) "mui-text-field"))

(defn text-field [props & children]
  (let [rows-max (get-anycase props :rows-max)
        autosize? (and (:multiline props) rows-max)
        input-component (or (get-anycase (:InputProps props) :input-component)
                            (cond
                              (and (:multiline props) (:rows props) (not rows-max))
                              textarea

                              autosize?
                              react-textarea-autosize

                              (:select props)
                              nil

                              :else
                              input))
        props (cond-> props
                input-component (update :InputProps #(assoc-anycase % :input-component input-component))
                autosize? (assoc-in [:input-props :rows-max] rows-max))]
    (into [mui-text-field props] children)))
