(ns reagent-material-ui.icons.fiber-manual-record-rounded
  "Imports @material-ui/icons/FiberManualRecordRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-manual-record-rounded (create-svg-icon (e "circle" #js {"cy" "12", "r" "7", "cx" "12"})
                                                  "FiberManualRecordRounded"))
