(ns reagent-mui.icons.turn-sharp-left-two-tone
  "Imports @mui/icons-material/TurnSharpLeftTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-sharp-left-two-tone (create-svg-icon (e "path" #js {"d" "M6 6.83 4.41 8.41 3 7l4-4 4 4-1.41 1.41L8 6.83V13h8c1.1 0 2 .9 2 2v6h-2v-6H8c-1.1 0-2-.9-2-2V6.83z"})
                                               "TurnSharpLeftTwoTone"))
