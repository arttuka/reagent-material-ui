(ns reagent-material-ui.icons.call-to-action-sharp
  "Imports @material-ui/icons/CallToActionSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-to-action-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16H3v-3h18v3z"})
                                           "CallToActionSharp"))
