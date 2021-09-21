(ns reagent-mui.icons.maximize-sharp
  "Imports @mui/icons-material/MaximizeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def maximize-sharp (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3V3z"})
                                     "MaximizeSharp"))
