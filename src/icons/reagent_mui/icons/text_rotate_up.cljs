(ns reagent-mui.icons.text-rotate-up
  "Imports @mui/icons-material/TextRotateUp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-rotate-up (create-svg-icon (e "path" #js {"d" "M3 12v1.5l11 4.75v-2.1l-2.2-.9v-5l2.2-.9v-2.1L3 12zm7 2.62-5.02-1.87L10 10.88v3.74zm8-10.37-3 3h2v12.5h2V7.25h2l-3-3z"})
                                     "TextRotateUp"))
