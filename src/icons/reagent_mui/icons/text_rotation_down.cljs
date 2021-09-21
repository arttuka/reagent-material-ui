(ns reagent-mui.icons.text-rotation-down
  "Imports @mui/icons-material/TextRotationDown as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-rotation-down (create-svg-icon (e "path" #js {"d" "M21 12v-1.5L10 5.75v2.1l2.2.9v5l-2.2.9v2.1L21 12zm-7-2.62 5.02 1.87L14 13.12V9.38zM6 19.75l3-3H7V4.25H5v12.5H3l3 3z"})
                                         "TextRotationDown"))
