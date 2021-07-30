(ns reagent-material-ui.icons.report-problem-two-tone
  "Imports @material-ui/icons/ReportProblemTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def report-problem-two-tone (create-svg-icon [(e "path" #js {"d" "M12 5.99 4.47 19h15.06L12 5.99zM13 18h-2v-2h2v2zm-2-4v-4h2v4h-2z", "opacity" ".3"}) (e "path" #js {"d" "M12 2 1 21h22L12 2zm0 3.99L19.53 19H4.47L12 5.99zM11 16h2v2h-2zm0-6h2v4h-2z"})]
                                              "ReportProblemTwoTone"))
