(ns reagent-material-ui.icons.report-gmailerrorred
  "Imports @material-ui/icons/ReportGmailerrorred as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def report-gmailerrorred (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.73 3H8.27L3 8.27v7.46L8.27 21h7.46L21 15.73V8.27L15.73 3zM19 14.9L14.9 19H9.1L5 14.9V9.1L9.1 5h5.8L19 9.1v5.8z"}) (e "path" #js {"d" "M11 7h2v6h-2zm0 8h2v2h-2z"}))
                                           "ReportGmailerrorred"))
