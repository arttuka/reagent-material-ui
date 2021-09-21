(ns reagent-mui.icons.system-security-update
  "Imports @mui/icons-material/SystemSecurityUpdate as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-security-update (create-svg-icon (e "path" #js {"d" "M5 3v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2zm12 15H7V6h10v12zm-1-6h-3V8h-2v4H8l4 4 4-4z"})
                                             "SystemSecurityUpdate"))
