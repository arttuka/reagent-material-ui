(ns reagent-material-ui.icons.scatter-plot-rounded
  "Imports @material-ui/icons/ScatterPlotRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def scatter-plot-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "14", "r" "4", "cx" "7"}) (e "circle" #js {"cy" "6", "r" "4", "cx" "11"}) (e "circle" #js {"cy" "17", "r" "4", "cx" "17"}))
                                           "ScatterPlotRounded"))
