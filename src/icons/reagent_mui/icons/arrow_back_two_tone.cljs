(ns reagent-mui.icons.arrow-back-two-tone
  "Imports @mui/icons-material/ArrowBackTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-back-two-tone (create-svg-icon (e "path" #js {"d" "M20 11H7.83l5.59-5.59L12 4l-8 8 8 8 1.41-1.41L7.83 13H20v-2z"})
                                          "ArrowBackTwoTone"))
