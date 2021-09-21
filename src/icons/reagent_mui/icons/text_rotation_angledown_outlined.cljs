(ns reagent-mui.icons.text-rotation-angledown-outlined
  "Imports @mui/icons-material/TextRotationAngledownOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-rotation-angledown-outlined (create-svg-icon (e "path" #js {"d" "M15 21v-4.24l-1.41 1.41-9.2-9.19-1.41 1.41 9.19 9.19L10.76 21H15zM11.25 8.48l3.54 3.54-.92 2.19 1.48 1.48 4.42-11.14-1.06-1.05L7.57 7.92 9.06 9.4l2.19-.92zm6.59-3.05-2.23 4.87-2.64-2.64 4.87-2.23z"})
                                                       "TextRotationAngledownOutlined"))
