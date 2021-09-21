(ns reagent-mui.icons.timer-10-select-sharp
  "Imports @mui/icons-material/Timer10SelectSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def timer-10-select-sharp (create-svg-icon (e "path" #js {"d" "M13 8v8h-3V8h3m3-3H7v14h9V5zM1 8h2v11h3V5H1v3zm22 3h-6v5h4v1h-4v2h6v-5h-4v-1h4v-2z"})
                                            "Timer10SelectSharp"))
