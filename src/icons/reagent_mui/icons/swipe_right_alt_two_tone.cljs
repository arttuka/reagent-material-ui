(ns reagent-mui.icons.swipe-right-alt-two-tone
  "Imports @mui/icons-material/SwipeRightAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-right-alt-two-tone (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "12", "r" "3", "opacity" ".3"}) (e "path" #js {"d" "M13.9 11c-.46-2.28-2.48-4-4.9-4-2.76 0-5 2.24-5 5s2.24 5 5 5c2.42 0 4.44-1.72 4.9-4h4.27l-1.59 1.59L18 16l4-4-4-4-1.41 1.41L18.17 11H13.9zM9 9c1.66 0 3 1.34 3 3s-1.34 3-3 3-3-1.34-3-3 1.34-3 3-3z"})]
                                               "SwipeRightAltTwoTone"))
