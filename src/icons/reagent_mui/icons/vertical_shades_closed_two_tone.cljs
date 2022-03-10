(ns reagent-mui.icons.vertical-shades-closed-two-tone
  "Imports @mui/icons-material/VerticalShadesClosedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-shades-closed-two-tone (create-svg-icon [(e "path" #js {"d" "M9.5 5H11v14H9.5zM6 5h1.5v14H6zm7 0h1.5v14H13zm3.5 0H18v14h-1.5z", "opacity" ".2"}) (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM7.5 19H6V5h1.5v14zm3.5 0H9.5V5H11v14zm3.5 0H13V5h1.5v14zm3.5 0h-1.5V5H18v14z"})]
                                                      "VerticalShadesClosedTwoTone"))
