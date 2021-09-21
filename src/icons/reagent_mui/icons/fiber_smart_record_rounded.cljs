(ns reagent-mui.icons.fiber-smart-record-rounded
  "Imports @mui/icons-material/FiberSmartRecordRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fiber-smart-record-rounded (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "12", "r" "8"}) (e "path" #js {"d" "M17 5.55v.18c0 .37.23.69.57.85C19.6 7.54 21 9.61 21 12s-1.4 4.46-3.43 5.42c-.34.16-.57.47-.57.84v.18c0 .68.71 1.11 1.32.82C21.08 18.01 23 15.23 23 12s-1.92-6.01-4.68-7.27c-.61-.28-1.32.14-1.32.82z"})]
                                                 "FiberSmartRecordRounded"))
