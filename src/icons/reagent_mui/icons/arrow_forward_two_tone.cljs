(ns reagent-mui.icons.arrow-forward-two-tone
  "Imports @mui/icons-material/ArrowForwardTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-forward-two-tone (create-svg-icon (e "path" #js {"d" "m12 4-1.41 1.41L16.17 11H4v2h12.17l-5.58 5.59L12 20l8-8-8-8z"})
                                             "ArrowForwardTwoTone"))
