(ns reagent-mui.icons.sim-card-alert-two-tone
  "Imports @mui/icons-material/SimCardAlertTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sim-card-alert-two-tone (create-svg-icon [(e "path" #js {"d" "M6 8.83V20h12V4h-7.17L6 8.83zM11 8h2v5h-2V8zm0 7h2v2h-2v-2z", "opacity" ".3"}) (e "path" #js {"d" "M18 2h-8L4 8v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 18H6V8.83L10.83 4H18v16z"}) (e "path" #js {"d" "M11 15h2v2h-2zm0-7h2v5h-2z"})]
                                              "SimCardAlertTwoTone"))
