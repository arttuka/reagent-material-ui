(ns reagent-material-ui.icons.pivot-table-chart-two-tone
  "Imports @material-ui/icons/PivotTableChartTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def pivot-table-chart-two-tone (create-svg-icon (e "path" #js {"d" "M21 5c0-1.1-.9-2-2-2h-9v5h11V5zM3 19c0 1.1.9 2 2 2h3V10H3v9zM3 5v3h5V3H5c-1.1 0-2 .9-2 2zm15 4-4 4h3v2c0 1.1-.9 2-2 2h-2v-3l-4 4 4 4v-3h2c2.21 0 4-1.79 4-4v-2h3l-4-4z"})
                                                 "PivotTableChartTwoTone"))
