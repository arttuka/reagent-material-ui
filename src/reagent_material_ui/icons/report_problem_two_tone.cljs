(ns reagent-material-ui.icons.report-problem-two-tone
  "Imports @material-ui/icons/ReportProblemTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def report-problem-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 5.99L4.47 19h15.06L12 5.99zM13 18h-2v-2h2v2zm-2-4v-4h2v4h-2z", "opacity" ".3"}) (e "path" #js {"d" "M12 2L1 21h22L12 2zm0 3.99L19.53 19H4.47L12 5.99zM11 16h2v2h-2zm0-6h2v4h-2z"}))
                                              "ReportProblemTwoTone"))
