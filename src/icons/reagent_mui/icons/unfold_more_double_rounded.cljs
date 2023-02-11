(ns reagent-mui.icons.unfold-more-double-rounded
  "Imports @mui/icons-material/UnfoldMoreDoubleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def unfold-more-double-rounded (create-svg-icon [(e "path" #js {"d" "M9.53 5.29 12 2.83l2.46 2.46c.39.39 1.02.39 1.41 0s.39-1.02 0-1.41L12.7.7a.9959.9959 0 0 0-1.41 0L8.12 3.88c-.39.39-.39 1.02 0 1.41s1.02.39 1.41 0z"}) (e "path" #js {"d" "M9.53 10.29 12 7.83l2.46 2.46c.39.39 1.02.39 1.41 0s.39-1.02 0-1.41L12.7 5.7a.9959.9959 0 0 0-1.41 0L8.12 8.88c-.39.39-.39 1.02 0 1.41s1.02.39 1.41 0zm4.94 3.42L12 16.17l-2.46-2.46a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l3.17 3.18c.39.39 1.02.39 1.41 0l3.17-3.18c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0z"}) (e "path" #js {"d" "M14.47 18.72 12 21.17l-2.46-2.46a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l3.17 3.18c.39.39 1.02.39 1.41 0l3.17-3.17c.39-.39.39-1.02 0-1.41s-1.02-.39-1.41 0z"})]
                                                 "UnfoldMoreDoubleRounded"))
