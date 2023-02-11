(ns reagent-mui.icons.unfold-less-double-sharp
  "Imports @mui/icons-material/UnfoldLessDoubleSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def unfold-less-double-sharp (create-svg-icon [(e "path" #js {"d" "M16.58 1.41 15.16 0l-3.17 3.17L8.82 0 7.41 1.41 11.99 6z"}) (e "path" #js {"d" "M16.58 6.41 15.16 5l-3.17 3.17L8.82 5 7.41 6.41 11.99 11zM7.42 17.59 8.84 19l3.17-3.17L15.18 19l1.41-1.41L12.01 13z"}) (e "path" #js {"d" "M7.42 22.59 8.84 24l3.17-3.17L15.18 24l1.41-1.41L12.01 18z"})]
                                               "UnfoldLessDoubleSharp"))
