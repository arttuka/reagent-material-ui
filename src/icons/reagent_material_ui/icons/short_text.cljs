(ns reagent-material-ui.icons.short-text
  "Imports @material-ui/icons/ShortText as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def short-text (create-svg-icon (e "path" #js {"d" "M4 9h16v2H4V9zm0 4h10v2H4v-2z"})
                                 "ShortText"))
