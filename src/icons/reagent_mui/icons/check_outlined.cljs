(ns reagent-mui.icons.check-outlined
  "Imports @mui/icons-material/CheckOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def check-outlined (create-svg-icon (e "path" #js {"d" "M9 16.17 4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41L9 16.17z"})
                                     "CheckOutlined"))
