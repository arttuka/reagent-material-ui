(ns reagent-mui.icons.fiber-manual-record-rounded
  "Imports @mui/icons-material/FiberManualRecordRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fiber-manual-record-rounded (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "8"})
                                                  "FiberManualRecordRounded"))
