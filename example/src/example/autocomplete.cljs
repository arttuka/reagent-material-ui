(ns example.autocomplete
  (:require-macros [reagent-mui.util :refer [react-component]])
  (:require [reagent.core :as r]
            [reagent-mui.material.autocomplete :refer [autocomplete] :rename {autocomplete mui-autocomplete}]
            [reagent-mui.material.text-field :refer [text-field]]))

(def options (clj->js [{:label "Denmark"
                        :code  "dk"
                        :flag  "\uD83C\uDDE9\uD83C\uDDF0"}
                       {:label "Finland"
                        :code  "fi"
                        :flag  "\uD83C\uDDEB\uD83C\uDDEE"}
                       {:label "France"
                        :code  "fr"
                        :flag  "\uD83C\uDDEB\uD83C\uDDF7"}
                       {:label "Germany"
                        :code  "de"
                        :flag  "\uD83C\uDDE9\uD83C\uDDEA"}
                       {:label "Iceland"
                        :code  "is"
                        :flag  "\uD83C\uDDEE\uD83C\uDDF8"}
                       {:label "Italy"
                        :code  "it"
                        :flag  "\uD83C\uDDEE\uD83C\uDDF9"}
                       {:label "Norway"
                        :code  "no"
                        :flag  "\uD83C\uDDF3\uD83C\uDDF4"}
                       {:label "Spain"
                        :code  "es"
                        :flag  "\uD83C\uDDEA\uD83C\uDDF8"}
                       {:label "Sweden"
                        :code  "se"
                        :flag  "\uD83C\uDDF8\uD83C\uDDEA"}
                       {:label "United Kingdom"
                        :code  "gb"
                        :flag  "\uD83C\uDDEC\uD83C\uDDE7"}]))

;; Options and value will be converted to JS objects and they are compared by strict equality,
;; meaning that they won't compare as equal after conversion from JS to CLJ and back.
;; For this reason it's better to keep them as JS objects or to supply a comparison function via :get-option-selected prop
(defn autocomplete [{:keys [class value on-change]}]
  [mui-autocomplete {:id            "autocomplete-demo"
                     :class         class
                     :options       options
                     :value         value
                     :on-change     (fn [event new-value]
                                      (on-change new-value))
                     :render-input  (react-component [props]
                                      [text-field (merge props
                                                         {:label "Autocomplete"})])
                     :render-option (react-component [props option]
                                      [:li props
                                       (:flag option)
                                       (:label option)])}])
