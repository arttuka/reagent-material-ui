(ns reagent-mui.icons.sms-failed-sharp
  "Imports @mui/icons-material/SmsFailedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sms-failed-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zm-9 12h-2v-2h2v2zm0-4h-2V6h2v4z"})
                                       "SmsFailedSharp"))
