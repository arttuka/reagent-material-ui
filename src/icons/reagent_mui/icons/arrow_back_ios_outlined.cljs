(ns reagent-mui.icons.arrow-back-ios-outlined
  "Imports @mui/icons-material/ArrowBackIosOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-back-ios-outlined (create-svg-icon (e "path" #js {"d" "M17.51 3.87 15.73 2.1 5.84 12l9.9 9.9 1.77-1.77L9.38 12l8.13-8.13z"})
                                              "ArrowBackIosOutlined"))
