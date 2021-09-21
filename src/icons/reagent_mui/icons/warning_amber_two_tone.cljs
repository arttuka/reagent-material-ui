(ns reagent-mui.icons.warning-amber-two-tone
  "Imports @mui/icons-material/WarningAmberTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def warning-amber-two-tone (create-svg-icon (e "path" #js {"d" "M1 21h22L12 2 1 21zm3.47-2L12 5.99 19.53 19H4.47zM11 16h2v2h-2zm0-6h2v4h-2z"})
                                             "WarningAmberTwoTone"))
