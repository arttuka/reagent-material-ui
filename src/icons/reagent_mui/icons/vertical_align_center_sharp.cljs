(ns reagent-mui.icons.vertical-align-center-sharp
  "Imports @mui/icons-material/VerticalAlignCenterSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-align-center-sharp (create-svg-icon (e "path" #js {"d" "M8 19h3v4h2v-4h3l-4-4-4 4zm8-14h-3V1h-2v4H8l4 4 4-4zM4 11v2h16v-2H4z"})
                                                  "VerticalAlignCenterSharp"))
