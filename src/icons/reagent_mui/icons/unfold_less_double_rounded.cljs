(ns reagent-mui.icons.unfold-less-double-rounded
  "Imports @mui/icons-material/UnfoldLessDoubleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def unfold-less-double-rounded (create-svg-icon [(e "path" #js {"d" "m14.46 5.7-2.47 2.46L9.53 5.7c-.39-.39-1.02-.39-1.41 0s-.39 1.02 0 1.41l3.17 3.18c.39.39 1.02.39 1.41 0l3.17-3.18c.39-.39.39-1.02 0-1.41s-1.02-.39-1.41 0z"}) (e "path" #js {"d" "m14.46.7-2.47 2.46L9.53.7C9.14.31 8.51.31 8.12.7s-.39 1.02 0 1.41l3.17 3.18c.39.39 1.02.39 1.41 0l3.17-3.18c.39-.39.39-1.02 0-1.41s-1.02-.39-1.41 0zM9.54 23.3l2.47-2.46 2.46 2.46c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-3.17-3.18a.9959.9959 0 0 0-1.41 0l-3.17 3.18c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0z"}) (e "path" #js {"d" "m9.54 18.29 2.47-2.45 2.46 2.46c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-3.17-3.18a.9959.9959 0 0 0-1.41 0l-3.17 3.17c-.39.39-.39 1.02 0 1.41s1.02.39 1.41 0z"})]
                                                 "UnfoldLessDoubleRounded"))
