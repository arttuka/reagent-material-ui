(ns reagent-mui.icons.west-rounded
  "Imports @mui/icons-material/WestRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def west-rounded (create-svg-icon (e "path" #js {"d" "M9.7 18.3c.39-.39.39-1.02 0-1.41L5.83 13H21c.55 0 1-.45 1-1s-.45-1-1-1H5.83l3.88-3.88c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L2.7 11.3c-.39.39-.39 1.02 0 1.41l5.59 5.59c.39.38 1.03.38 1.41 0z"})
                                   "WestRounded"))
