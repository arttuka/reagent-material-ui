(ns reagent-mui.icons.r-mobiledata-outlined
  "Imports @mui/icons-material/RMobiledataOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def r-mobiledata-outlined (create-svg-icon (e "path" #js {"d" "M7.8 7.2 9 10H7L5.87 7.33H4V10H2V2h5c1.13 0 2 .87 2 2v1.33c0 .8-.53 1.54-1.2 1.87zM7 4H4v1.33h3V4z"})
                                            "RMobiledataOutlined"))
