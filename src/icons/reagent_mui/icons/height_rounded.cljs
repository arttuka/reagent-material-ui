(ns reagent-mui.icons.height-rounded
  "Imports @mui/icons-material/HeightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def height-rounded (create-svg-icon (e "path" #js {"d" "M13 6.99h1.79c.45 0 .67-.54.35-.85l-2.79-2.78c-.2-.19-.51-.19-.71 0L8.86 6.14c-.32.31-.1.85.35.85H11v10.02H9.21c-.45 0-.67.54-.35.85l2.79 2.78c.2.19.51.19.71 0l2.79-2.78c.32-.31.09-.85-.35-.85H13V6.99z"})
                                     "HeightRounded"))
