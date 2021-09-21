(ns reagent-mui.icons.maximize-outlined
  "Imports @mui/icons-material/MaximizeOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def maximize-outlined (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3V3z"})
                                        "MaximizeOutlined"))
