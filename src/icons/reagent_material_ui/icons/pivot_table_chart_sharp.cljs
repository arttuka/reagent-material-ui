(ns reagent-material-ui.icons.pivot-table-chart-sharp
  "Imports @material-ui/icons/PivotTableChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def pivot-table-chart-sharp (create-svg-icon (e "path" #js {"d" "M10 3h11v5H10zm-7 7h5v11H3zm0-7h5v5H3zm15 6l-4 4h3v4h-4v-3l-4 4 4 4v-3h6v-6h3z"})
                                              "PivotTableChartSharp"))
