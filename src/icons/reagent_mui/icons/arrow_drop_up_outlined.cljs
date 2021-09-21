(ns reagent-mui.icons.arrow-drop-up-outlined
  "Imports @mui/icons-material/ArrowDropUpOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-drop-up-outlined (create-svg-icon (e "path" #js {"d" "m7 14 5-5 5 5H7z"})
                                             "ArrowDropUpOutlined"))
