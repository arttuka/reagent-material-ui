(ns reagent-mui.icons.thumb-down-off-alt-sharp
  "Imports @mui/icons-material/ThumbDownOffAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def thumb-down-off-alt-sharp (create-svg-icon (e "path" #js {"d" "M19 3h4v12h-4zM1 11.6V16h8.31l-1.12 5.38L9.83 23 17 15.82V3H4.69L1 11.6zM15 5v9.99l-4.34 4.35.61-2.93.5-2.41H3v-1.99L6.01 5H15z"})
                                               "ThumbDownOffAltSharp"))
