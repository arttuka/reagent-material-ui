(ns reagent-mui.icons.expand-circle-down-two-tone
  "Imports @mui/icons-material/ExpandCircleDownTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def expand-circle-down-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4c-4.42 0-8 3.58-8 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8zm0 11.5L7.5 11l1.42-1.41L12 12.67l3.08-3.08L16.5 11 12 15.5z", "opacity" ".3"}) (e "path" #js {"d" "M15.08 9.59 12 12.67 8.92 9.59 7.5 11l4.5 4.5 4.5-4.5-1.42-1.41zM12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"})]
                                                  "ExpandCircleDownTwoTone"))
