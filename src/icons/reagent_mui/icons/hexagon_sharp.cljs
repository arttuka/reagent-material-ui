(ns reagent-mui.icons.hexagon-sharp
  "Imports @mui/icons-material/HexagonSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hexagon-sharp (create-svg-icon (e "path" #js {"d" "M17.2 3H6.8l-5.2 9 5.2 9h10.4l5.2-9z"})
                                    "HexagonSharp"))
