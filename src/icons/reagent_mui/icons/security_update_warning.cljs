(ns reagent-mui.icons.security-update-warning
  "Imports @mui/icons-material/SecurityUpdateWarning as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def security-update-warning (create-svg-icon [(e "path" #js {"d" "M11 15h2v2h-2zm0-8h2v6h-2z"}) (e "path" #js {"d" "M17 1H7c-1.1 0-1.99.9-1.99 2v18c0 1.1.89 2 1.99 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 17H7V6h10v12z"})]
                                              "SecurityUpdateWarning"))
