(ns reagent-mui.icons.sim-card-alert-outlined
  "Imports @mui/icons-material/SimCardAlertOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sim-card-alert-outlined (create-svg-icon [(e "path" #js {"d" "M18 2h-8L4.02 8 4 20c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 18H6V8.83L10.83 4H18v16z"}) (e "path" #js {"d" "M11 15h2v2h-2zm0-7h2v5h-2z"})]
                                              "SimCardAlertOutlined"))
