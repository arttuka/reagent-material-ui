(ns reagent-mui.icons.north-outlined
  "Imports @mui/icons-material/NorthOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def north-outlined (create-svg-icon (e "path" #js {"d" "m5 9 1.41 1.41L11 5.83V22h2V5.83l4.59 4.59L19 9l-7-7-7 7z"})
                                     "NorthOutlined"))
