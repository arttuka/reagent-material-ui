(ns reagent-mui.icons.call-made-two-tone
  "Imports @mui/icons-material/CallMadeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-made-two-tone (create-svg-icon (e "path" #js {"d" "M5.41 20 17 8.41V15h2V5H9v2h6.59L4 18.59z"})
                                         "CallMadeTwoTone"))
