(ns reagent-mui.icons.swipe-right
  "Imports @mui/icons-material/SwipeRight as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-right (create-svg-icon (e "path" #js {"d" "m19.98 16.82-.63 4.46c-.14.99-.99 1.72-1.98 1.72h-6.16c-.53 0-1.29-.21-1.66-.59L5 17.62l.83-.84c.24-.24.58-.35.92-.28l3.25.74V6.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v6h.91c.31 0 .62.07.89.21l4.09 2.04c.77.39 1.21 1.22 1.09 2.07zM19.91 5.5H17V7h5V2h-1.5v2.02C18.18 2.13 15.22 1 12 1 6.51 1 2.73 4.12 2 7h1.57C4.33 5.02 7.26 2.5 12 2.5c3.03 0 5.79 1.14 7.91 3z"})
                                  "SwipeRight"))
