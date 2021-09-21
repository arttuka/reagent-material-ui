(ns reagent-mui.icons.system-security-update-sharp
  "Imports @mui/icons-material/SystemSecurityUpdateSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-security-update-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 17H7V6h10v12zm-1-6h-3V8h-2v4H8l4 4 4-4z"})
                                                   "SystemSecurityUpdateSharp"))
