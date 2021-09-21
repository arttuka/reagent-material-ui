(ns reagent-mui.icons.sms-sharp
  "Imports @mui/icons-material/SmsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sms-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zM9 11H7V9h2v2zm4 0h-2V9h2v2zm4 0h-2V9h2v2z"})
                                "SmsSharp"))
