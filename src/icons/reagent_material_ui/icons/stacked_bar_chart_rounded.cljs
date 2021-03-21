(ns reagent-material-ui.icons.stacked-bar-chart-rounded
  "Imports @material-ui/icons/StackedBarChartRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stacked-bar-chart-rounded (create-svg-icon (e "path" #js {"d" "M6 10h3v8.5c0 .83-.67 1.5-1.5 1.5S6 19.33 6 18.5V10zm1.5-5C8.33 5 9 5.67 9 6.5V9H6V6.5C6 5.67 6.67 5 7.5 5zM16 16h3v2.5c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5V16zm-5-3h3v5.5c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5V13zm1.5-4c.83 0 1.5.67 1.5 1.5V12h-3v-1.5c0-.83.67-1.5 1.5-1.5zm6.5 6h-3v-.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v.5z"})
                                                "StackedBarChartRounded"))
