(ns reagent-mui.icons.square
  "Imports @mui/icons-material/Square as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def square (create-svg-icon (e "path" #js {"d" "M3 3h18v18H3z"})
                             "Square"))
