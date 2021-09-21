(ns reagent-mui.icons.arrow-back-ios
  "Imports @mui/icons-material/ArrowBackIos as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-back-ios (create-svg-icon (e "path" #js {"d" "M11.67 3.87 9.9 2.1 0 12l9.9 9.9 1.77-1.77L3.54 12z"})
                                     "ArrowBackIos"))
