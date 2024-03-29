(ns reagent-mui.icons.thumb-down-alt-two-tone
  "Imports @mui/icons-material/ThumbDownAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def thumb-down-alt-two-tone (create-svg-icon [(e "path" #js {"d" "M3 12v2h8.77l-1.11 5.34L15 15V5H6z", "opacity" ".3"}) (e "path" #js {"d" "M15 3H6c-.83 0-1.54.5-1.84 1.22l-3.02 7.05c-.09.23-.14.47-.14.73v2c0 1.1.9 2 2 2h6.31l-.95 4.57-.03.32c0 .41.17.79.44 1.06L9.83 23l6.58-6.59c.37-.36.59-.86.59-1.41V5c0-1.1-.9-2-2-2zm0 12-4.34 4.34L11.77 14H3v-2l3-7h9v10zm4-12h4v12h-4z"})]
                                              "ThumbDownAltTwoTone"))
