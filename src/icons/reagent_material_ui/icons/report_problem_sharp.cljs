(ns reagent-material-ui.icons.report-problem-sharp
  "Imports @material-ui/icons/ReportProblemSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def report-problem-sharp (create-svg-icon (e "path" #js {"d" "M1 21h22L12 2 1 21zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z"})
                                           "ReportProblemSharp"))
