(ns reagent-mui.icons.vertical-align-bottom-sharp
  "Imports @mui/icons-material/VerticalAlignBottomSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-align-bottom-sharp (create-svg-icon (e "path" #js {"d" "M16 13h-3V3h-2v10H8l4 4 4-4zM4 19v2h16v-2H4z"})
                                                  "VerticalAlignBottomSharp"))
