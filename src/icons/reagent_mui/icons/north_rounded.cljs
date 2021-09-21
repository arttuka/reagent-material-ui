(ns reagent-mui.icons.north-rounded
  "Imports @mui/icons-material/NorthRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def north-rounded (create-svg-icon (e "path" #js {"d" "M5.71 9.7c.39.39 1.02.39 1.41 0L11 5.83V21c0 .55.45 1 1 1s1-.45 1-1V5.83l3.88 3.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 2.7a.9959.9959 0 0 0-1.41 0L5.71 8.29c-.39.39-.39 1.03 0 1.41z"})
                                    "NorthRounded"))
