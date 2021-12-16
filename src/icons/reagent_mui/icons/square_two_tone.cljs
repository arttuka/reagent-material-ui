(ns reagent-mui.icons.square-two-tone
  "Imports @mui/icons-material/SquareTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def square-two-tone (create-svg-icon [(e "path" #js {"d" "M5 5h14v14H5z", "opacity" ".3"}) (e "path" #js {"d" "M3 3v18h18V3H3zm16 16H5V5h14v14z"})]
                                      "SquareTwoTone"))
