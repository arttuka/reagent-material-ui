(ns reagent-mui.icons.expand-less-two-tone
  "Imports @mui/icons-material/ExpandLessTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def expand-less-two-tone (create-svg-icon (e "path" #js {"d" "m12 8-6 6 1.41 1.41L12 10.83l4.59 4.58L18 14l-6-6z"})
                                           "ExpandLessTwoTone"))
