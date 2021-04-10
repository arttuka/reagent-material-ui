(ns reagent-material-ui.icons.fiber-manual-record-rounded
  "Imports @material-ui/icons/FiberManualRecordRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fiber-manual-record-rounded (create-svg-icon (e "circle" #js {"cy" "12", "r" "8", "cx" "12"})
                                                  "FiberManualRecordRounded"))
