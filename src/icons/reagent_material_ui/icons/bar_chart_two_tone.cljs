(ns reagent-material-ui.icons.bar-chart-two-tone
  "Imports @material-ui/icons/BarChartTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bar-chart-two-tone (create-svg-icon (e "path" #js {"d" "M5 9.2h3V19H5zM16.2 13H19v6h-2.8zm-5.6-8h2.8v14h-2.8z"})
                                         "BarChartTwoTone"))
