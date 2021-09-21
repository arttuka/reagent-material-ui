(ns reagent-mui.icons.call-merge-two-tone
  "Imports @mui/icons-material/CallMergeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-merge-two-tone (create-svg-icon (e "path" #js {"d" "m16.997 20.41-3.408-3.407 1.4-1.407 3.41 3.408zM5.59 19 7 20.41l6-6V8h3.5L12 3.5 7.5 8H11v5.59z"})
                                          "CallMergeTwoTone"))
