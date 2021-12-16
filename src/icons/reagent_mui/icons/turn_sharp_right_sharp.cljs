(ns reagent-mui.icons.turn-sharp-right-sharp
  "Imports @mui/icons-material/TurnSharpRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-sharp-right-sharp (create-svg-icon (e "path" #js {"d" "m18 6.83 1.59 1.58L21 7l-4-4-4 4 1.41 1.41L16 6.83V13H6v8h2v-6h10z"})
                                             "TurnSharpRightSharp"))
