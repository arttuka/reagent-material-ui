(ns reagent-mui.icons.turn-sharp-right-outlined
  "Imports @mui/icons-material/TurnSharpRightOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-sharp-right-outlined (create-svg-icon (e "path" #js {"d" "m18 6.83 1.59 1.59L21 7l-4-4-4 4 1.41 1.41L16 6.83V13H8c-1.1 0-2 .9-2 2v6h2v-6h8c1.1 0 2-.9 2-2V6.83z"})
                                                "TurnSharpRightOutlined"))
