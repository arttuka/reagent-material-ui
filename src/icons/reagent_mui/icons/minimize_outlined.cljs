(ns reagent-mui.icons.minimize-outlined
  "Imports @mui/icons-material/MinimizeOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def minimize-outlined (create-svg-icon (e "path" #js {"d" "M6 19h12v2H6v-2z"})
                                        "MinimizeOutlined"))
