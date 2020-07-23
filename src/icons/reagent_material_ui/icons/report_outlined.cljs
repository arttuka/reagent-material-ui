(ns reagent-material-ui.icons.report-outlined
  "Imports @material-ui/icons/ReportOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def report-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.73 3H8.27L3 8.27v7.46L8.27 21h7.46L21 15.73V8.27L15.73 3zM19 14.9L14.9 19H9.1L5 14.9V9.1L9.1 5h5.8L19 9.1v5.8z"}) (e "circle" #js {"cy" "16", "r" "1", "cx" "12"}) (e "path" #js {"d" "M11 7h2v7h-2z"}))
                                      "ReportOutlined"))
