(ns reagent-mui.icons.report-problem-sharp
  "Imports @mui/icons-material/ReportProblemSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def report-problem-sharp (create-svg-icon (e "path" #js {"d" "M1 21h22L12 2 1 21zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z"})
                                           "ReportProblemSharp"))
