(ns reagent-mui.icons.call-to-action-sharp
  "Imports @mui/icons-material/CallToActionSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-to-action-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16H3v-3h18v3z"})
                                           "CallToActionSharp"))
