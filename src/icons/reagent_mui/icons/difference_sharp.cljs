(ns reagent-mui.icons.difference-sharp
  "Imports @mui/icons-material/DifferenceSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def difference-sharp (create-svg-icon (e "path" #js {"d" "M18 23H2V7h2v14h14v2zM15 1H6.01L6 19h15V7l-6-6zm1.5 14h-6v-2h6v2zm0-6h-2v2h-2V9h-2V7h2V5h2v2h2v2z"})
                                       "DifferenceSharp"))
