(ns reagent-material-ui.icons.waterfall-chart-outlined
  "Imports @material-ui/icons/WaterfallChartOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def waterfall-chart-outlined (create-svg-icon (e "path" #js {"d" "M18 4h3v16h-3V4zM3 13h3v7H3v-7zm11-9h3v3h-3V4zm-4 1h3v4h-3V5zm-3 5h3v4H7v-4z"})
                                               "WaterfallChartOutlined"))
