(ns reagent-material-ui.icons.waterfall-chart-sharp
  "Imports @material-ui/icons/WaterfallChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def waterfall-chart-sharp (create-svg-icon (e "path" #js {"d" "M18 4h3v16h-3V4zM3 13h3v7H3v-7zm11-9h3v3h-3V4zm-4 1h3v4h-3V5zm-3 5h3v4H7v-4z"})
                                            "WaterfallChartSharp"))
