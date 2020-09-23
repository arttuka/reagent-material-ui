(ns reagent-material-ui.icons.bar-chart-outlined
  "Imports @material-ui/icons/BarChartOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bar-chart-outlined (create-svg-icon (e "path" #js {"d" "M5 9.2h3V19H5V9.2zM10.6 5h2.8v14h-2.8V5zm5.6 8H19v6h-2.8v-6z"})
                                         "BarChartOutlined"))
