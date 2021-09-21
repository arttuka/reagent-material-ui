(ns reagent-mui.icons.north-west-outlined
  "Imports @mui/icons-material/NorthWestOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def north-west-outlined (create-svg-icon (e "path" #js {"d" "M5 15h2V8.41L18.59 20 20 18.59 8.41 7H15V5H5v10z"})
                                          "NorthWestOutlined"))
