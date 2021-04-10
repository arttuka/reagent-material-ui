(ns reagent-material-ui.icons.bar-chart
  "Imports @material-ui/icons/BarChart as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bar-chart (create-svg-icon (e "path" #js {"d" "M5 9.2h3V19H5zM10.6 5h2.8v14h-2.8zm5.6 8H19v6h-2.8z"})
                                "BarChart"))
