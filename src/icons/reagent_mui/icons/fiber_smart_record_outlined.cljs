(ns reagent-mui.icons.fiber-smart-record-outlined
  "Imports @mui/icons-material/FiberSmartRecordOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fiber-smart-record-outlined (create-svg-icon (e "path" #js {"d" "M9 4c-4.42 0-8 3.58-8 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8zm0 14c-3.31 0-6-2.69-6-6s2.69-6 6-6 6 2.69 6 6-2.69 6-6 6zm8-13.74v2.09c2.33.82 4 3.04 4 5.65s-1.67 4.83-4 5.65v2.09c3.45-.89 6-4.01 6-7.74 0-3.73-2.55-6.85-6-7.74z"})
                                                  "FiberSmartRecordOutlined"))
