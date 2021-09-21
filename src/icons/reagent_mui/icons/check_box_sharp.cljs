(ns reagent-mui.icons.check-box-sharp
  "Imports @mui/icons-material/CheckBoxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def check-box-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM10 17l-5-5 1.41-1.41L10 14.17l7.59-7.59L19 8l-9 9z"})
                                      "CheckBoxSharp"))
