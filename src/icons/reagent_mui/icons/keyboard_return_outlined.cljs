(ns reagent-mui.icons.keyboard-return-outlined
  "Imports @mui/icons-material/KeyboardReturnOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-return-outlined (create-svg-icon (e "path" #js {"d" "M19 7v4H5.83l3.58-3.59L8 6l-6 6 6 6 1.41-1.41L5.83 13H21V7h-2z"})
                                               "KeyboardReturnOutlined"))
