(ns reagent-mui.icons.fiber-smart-record-sharp
  "Imports @mui/icons-material/FiberSmartRecordSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fiber-smart-record-sharp (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "12", "r" "8"}) (e "path" #js {"d" "M17 4.26v2.09c2.33.82 4 3.04 4 5.65s-1.67 4.83-4 5.65v2.09c3.45-.89 6-4.01 6-7.74s-2.55-6.85-6-7.74z"})]
                                               "FiberSmartRecordSharp"))
