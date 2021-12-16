(ns reagent-mui.icons.swipe-left-alt
  "Imports @mui/icons-material/SwipeLeftAlt as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-left-alt (create-svg-icon (e "path" #js {"d" "M10.1 13c.46 2.28 2.48 4 4.9 4 2.76 0 5-2.24 5-5s-2.24-5-5-5c-2.42 0-4.44 1.72-4.9 4H5.83l1.59-1.59L6 8l-4 4 4 4 1.41-1.41L5.83 13h4.27z"})
                                     "SwipeLeftAlt"))
