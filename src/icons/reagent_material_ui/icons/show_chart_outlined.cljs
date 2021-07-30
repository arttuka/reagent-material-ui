(ns reagent-material-ui.icons.show-chart-outlined
  "Imports @material-ui/icons/ShowChartOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def show-chart-outlined (create-svg-icon (e "path" #js {"d" "m3.5 18.49 6-6.01 4 4L22 6.92l-1.41-1.41-7.09 7.97-4-4L2 16.99l1.5 1.5z"})
                                          "ShowChartOutlined"))
