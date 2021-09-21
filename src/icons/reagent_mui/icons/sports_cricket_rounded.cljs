(ns reagent-mui.icons.sports-cricket-rounded
  "Imports @mui/icons-material/SportsCricketRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sports-cricket-rounded (create-svg-icon [(e "path" #js {"d" "M15.05 12.81 6.56 4.32a.9959.9959 0 0 0-1.41 0L2.32 7.15c-.39.39-.39 1.02 0 1.41l8.49 8.49c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41zm-.71 4.95 3.53 3.53c.39.39 1.03.39 1.42 0 .39-.39.39-1.03 0-1.42l-3.53-3.53-1.42 1.42z"}) (e "circle" #js {"cx" "18.5", "cy" "5.5", "r" "3.5"})]
                                             "SportsCricketRounded"))
