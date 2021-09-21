(ns reagent-mui.icons.fiber-manual-record-sharp
  "Imports @mui/icons-material/FiberManualRecordSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fiber-manual-record-sharp (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "8"})
                                                "FiberManualRecordSharp"))
