(ns reagent-mui.icons.u-turn-right-sharp
  "Imports @mui/icons-material/UTurnRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def u-turn-right-sharp (create-svg-icon (e "path" #js {"d" "M6 9v12h2V9c0-2.21 1.79-4 4-4s4 1.79 4 4v4.17l-1.59-1.59L13 13l4 4 4-4-1.41-1.41L18 13.17V9c0-3.31-2.69-6-6-6S6 5.69 6 9z"})
                                         "UTurnRightSharp"))
