(ns reagent-material-ui.icons.sim-card-alert-rounded
  "Imports @material-ui/icons/SimCardAlertRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sim-card-alert-rounded (create-svg-icon (e "path" #js {"d" "M18 2h-7.17c-.53 0-1.04.21-1.42.59L4.6 7.42c-.37.37-.58.88-.58 1.4L4 20c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-6 15c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-4c-.55 0-1-.45-1-1V9c0-.55.45-1 1-1s1 .45 1 1v3c0 .55-.45 1-1 1z"})
                                             "SimCardAlertRounded"))
