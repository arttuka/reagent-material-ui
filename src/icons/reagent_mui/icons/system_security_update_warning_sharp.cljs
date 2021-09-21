(ns reagent-mui.icons.system-security-update-warning-sharp
  "Imports @mui/icons-material/SystemSecurityUpdateWarningSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-security-update-warning-sharp (create-svg-icon [(e "path" #js {"d" "M11 15h2v2h-2zm0-8h2v6h-2z"}) (e "path" #js {"d" "M5.01 1v22H19V1H5.01zM17 18H7V6h10v12z"})]
                                                           "SystemSecurityUpdateWarningSharp"))
