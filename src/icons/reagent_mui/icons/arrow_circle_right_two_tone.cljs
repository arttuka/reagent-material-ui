(ns reagent-mui.icons.arrow-circle-right-two-tone
  "Imports @mui/icons-material/ArrowCircleRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-circle-right-two-tone (create-svg-icon [(e "path" #js {"d" "M4 12c0-4.41 3.59-8 8-8s8 3.59 8 8-3.59 8-8 8-8-3.59-8-8m8-1H8v2h4v3l4-4-4-4v3z", "opacity" ".3"}) (e "path" #js {"d" "M4 12c0-4.41 3.59-8 8-8s8 3.59 8 8-3.59 8-8 8-8-3.59-8-8m-2 0c0 5.52 4.48 10 10 10s10-4.48 10-10S17.52 2 12 2 2 6.48 2 12zm10-1H8v2h4v3l4-4-4-4v3z"})]
                                                  "ArrowCircleRightTwoTone"))
