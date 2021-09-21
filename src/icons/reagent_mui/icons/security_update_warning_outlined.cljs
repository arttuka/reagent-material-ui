(ns reagent-mui.icons.security-update-warning-outlined
  "Imports @mui/icons-material/SecurityUpdateWarningOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def security-update-warning-outlined (create-svg-icon [(e "path" #js {"d" "M11 15h2v2h-2zm0-8h2v6h-2z"}) (e "path" #js {"d" "M17 1.01 7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 21H7v-1h10v1zm0-3H7V6h10v12zm0-14H7V3h10v1z"})]
                                                       "SecurityUpdateWarningOutlined"))
