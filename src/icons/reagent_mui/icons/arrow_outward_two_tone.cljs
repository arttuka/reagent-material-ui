(ns reagent-mui.icons.arrow-outward-two-tone
  "Imports @mui/icons-material/ArrowOutwardTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-outward-two-tone (create-svg-icon (e "path" #js {"d" "M6 6v2h8.59L5 17.59 6.41 19 16 9.41V18h2V6z"})
                                             "ArrowOutwardTwoTone"))
