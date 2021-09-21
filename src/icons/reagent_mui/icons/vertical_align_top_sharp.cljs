(ns reagent-mui.icons.vertical-align-top-sharp
  "Imports @mui/icons-material/VerticalAlignTopSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-align-top-sharp (create-svg-icon (e "path" #js {"d" "M8 11h3v10h2V11h3l-4-4-4 4zM4 3v2h16V3H4z"})
                                               "VerticalAlignTopSharp"))
