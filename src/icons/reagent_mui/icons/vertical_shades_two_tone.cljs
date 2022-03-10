(ns reagent-mui.icons.vertical-shades-two-tone
  "Imports @mui/icons-material/VerticalShadesTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-shades-two-tone (create-svg-icon [(e "path" #js {"d" "M6 5h2v14H6zm10 0h2v14h-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM8 19H6V5h2v14zm6 0h-4V5h4v14zm4 0h-2V5h2v14z"})]
                                               "VerticalShadesTwoTone"))
