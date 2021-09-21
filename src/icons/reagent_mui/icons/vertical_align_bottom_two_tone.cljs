(ns reagent-mui.icons.vertical-align-bottom-two-tone
  "Imports @mui/icons-material/VerticalAlignBottomTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-align-bottom-two-tone (create-svg-icon (e "path" #js {"d" "M11 3v10H8l4 4 4-4h-3V3zM4 19h16v2H4z"})
                                                     "VerticalAlignBottomTwoTone"))
