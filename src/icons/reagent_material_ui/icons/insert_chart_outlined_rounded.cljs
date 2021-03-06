(ns reagent-material-ui.icons.insert-chart-outlined-rounded
  "Imports @material-ui/icons/InsertChartOutlinedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-chart-outlined-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14zM8 10c.55 0 1 .45 1 1v5c0 .55-.45 1-1 1s-1-.45-1-1v-5c0-.55.45-1 1-1zm4-3c.55 0 1 .45 1 1v8c0 .55-.45 1-1 1s-1-.45-1-1V8c0-.55.45-1 1-1zm4 6c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1s-1-.45-1-1v-2c0-.55.45-1 1-1z"})
                                                    "InsertChartOutlinedRounded"))
