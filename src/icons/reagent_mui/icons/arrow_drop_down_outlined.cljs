(ns reagent-mui.icons.arrow-drop-down-outlined
  "Imports @mui/icons-material/ArrowDropDownOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-drop-down-outlined (create-svg-icon (e "path" #js {"d" "m7 10 5 5 5-5H7z"})
                                               "ArrowDropDownOutlined"))
