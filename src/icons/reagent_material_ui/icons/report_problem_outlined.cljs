(ns reagent-material-ui.icons.report-problem-outlined
  "Imports @material-ui/icons/ReportProblemOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def report-problem-outlined (create-svg-icon (e "path" #js {"d" "M12 5.99 19.53 19H4.47L12 5.99M12 2 1 21h22L12 2zm1 14h-2v2h2v-2zm0-6h-2v4h2v-4z"})
                                              "ReportProblemOutlined"))
