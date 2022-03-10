(ns reagent-mui.icons.screen-rotation-alt-sharp
  "Imports @mui/icons-material/ScreenRotationAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def screen-rotation-alt-sharp (create-svg-icon (e "path" #js {"d" "m4 7.59 6.41-6.41L20.24 11h-2.83L10.4 4 5.41 9H8v2H2V5h2v2.59zM20 19h2v-6h-6v2h2.59l-4.99 5-7.01-7H3.76l9.83 9.83L20 16.41V19z"})
                                                "ScreenRotationAltSharp"))
