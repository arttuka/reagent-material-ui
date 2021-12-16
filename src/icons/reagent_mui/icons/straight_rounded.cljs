(ns reagent-mui.icons.straight-rounded
  "Imports @mui/icons-material/StraightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def straight-rounded (create-svg-icon (e "path" #js {"d" "m13 6.83.88.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 3.71a.9959.9959 0 0 0-1.41 0L8.71 6.29c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.88-.87V20c0 .55.45 1 1 1s1-.45 1-1V6.83z"})
                                       "StraightRounded"))
