(ns reagent-material-ui.icons.call-to-action-sharp
  "Imports @material-ui/icons/CallToActionSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-to-action-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16H3v-3h18v3z"})
                                           "CallToActionSharp"))
