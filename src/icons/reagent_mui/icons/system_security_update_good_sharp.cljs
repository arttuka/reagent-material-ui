(ns reagent-mui.icons.system-security-update-good-sharp
  "Imports @mui/icons-material/SystemSecurityUpdateGoodSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-security-update-good-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 17H7V6h10v12zm-1-7.95-1.41-1.41-3.54 3.54-1.41-1.41-1.41 1.41L11.05 15 16 10.05z"})
                                                        "SystemSecurityUpdateGoodSharp"))
