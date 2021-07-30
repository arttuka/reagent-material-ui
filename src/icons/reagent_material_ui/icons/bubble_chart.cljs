(ns reagent-material-ui.icons.bubble-chart
  "Imports @material-ui/icons/BubbleChart as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bubble-chart (create-svg-icon [(e "circle" #js {"cx" "7.2", "cy" "14.4", "r" "3.2"}) (e "circle" #js {"cx" "14.8", "cy" "18", "r" "2"}) (e "circle" #js {"cx" "15.2", "cy" "8.8", "r" "4.8"})]
                                   "BubbleChart"))
