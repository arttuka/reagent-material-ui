(ns reagent-mui.icons.r-mobiledata-sharp
  "Imports @mui/icons-material/RMobiledataSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def r-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M7.8 7.2 9 10H7L5.87 7.33H4V10H2V2h7v5.2H7.8zM7 4H4v1.33h3V4z"})
                                         "RMobiledataSharp"))
