(ns reagent-mui.icons.north-east-outlined
  "Imports @mui/icons-material/NorthEastOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def north-east-outlined (create-svg-icon (e "path" #js {"d" "M9 5v2h6.59L4 18.59 5.41 20 17 8.41V15h2V5H9z"})
                                          "NorthEastOutlined"))
