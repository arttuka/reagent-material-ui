(ns reagent-mui.icons.unfold-less-two-tone
  "Imports @mui/icons-material/UnfoldLessTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def unfold-less-two-tone (create-svg-icon (e "path" #js {"d" "M7.41 18.59 8.83 20 12 16.83 15.17 20l1.41-1.41L12 14l-4.59 4.59zm9.18-13.18L15.17 4 12 7.17 8.83 4 7.41 5.41 12 10l4.59-4.59z"})
                                           "UnfoldLessTwoTone"))
