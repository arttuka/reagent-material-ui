(ns reagent-mui.icons.warning-two-tone
  "Imports @mui/icons-material/WarningTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def warning-two-tone (create-svg-icon [(e "path" #js {"d" "M4.47 19h15.06L12 5.99 4.47 19zM13 18h-2v-2h2v2zm0-4h-2v-4h2v4z", "opacity" ".3"}) (e "path" #js {"d" "M1 21h22L12 2 1 21zm3.47-2L12 5.99 19.53 19H4.47zM11 16h2v2h-2zm0-6h2v4h-2z"})]
                                       "WarningTwoTone"))
