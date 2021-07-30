(ns reagent-material-ui.icons.scatter-plot-sharp
  "Imports @material-ui/icons/ScatterPlotSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def scatter-plot-sharp (create-svg-icon [(e "circle" #js {"cx" "7", "cy" "14", "r" "3"}) (e "circle" #js {"cx" "11", "cy" "6", "r" "3"}) (e "circle" #js {"cx" "16.6", "cy" "17.6", "r" "3"})]
                                         "ScatterPlotSharp"))
