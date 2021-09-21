(ns reagent-mui.icons.expand-more-two-tone
  "Imports @mui/icons-material/ExpandMoreTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def expand-more-two-tone (create-svg-icon (e "path" #js {"d" "M16.59 8.59 12 13.17 7.41 8.59 6 10l6 6 6-6-1.41-1.41z"})
                                           "ExpandMoreTwoTone"))
