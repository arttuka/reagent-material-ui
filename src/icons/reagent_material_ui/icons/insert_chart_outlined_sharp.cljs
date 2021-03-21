(ns reagent-material-ui.icons.insert-chart-outlined-sharp
  "Imports @material-ui/icons/InsertChartOutlinedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def insert-chart-outlined-sharp (create-svg-icon (e "path" #js {"d" "M9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4zm2 2H5V5h14v14zm2-16H3v18h18V3z"})
                                                  "InsertChartOutlinedSharp"))
