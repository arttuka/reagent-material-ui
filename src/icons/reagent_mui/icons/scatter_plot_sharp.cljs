(ns reagent-mui.icons.scatter-plot-sharp
  "Imports @mui/icons-material/ScatterPlotSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def scatter-plot-sharp (create-svg-icon [(e "circle" #js {"cx" "7", "cy" "14", "r" "3"}) (e "circle" #js {"cx" "11", "cy" "6", "r" "3"}) (e "circle" #js {"cx" "16.6", "cy" "17.6", "r" "3"})]
                                         "ScatterPlotSharp"))
