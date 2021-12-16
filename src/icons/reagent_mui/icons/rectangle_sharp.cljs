(ns reagent-mui.icons.rectangle-sharp
  "Imports @mui/icons-material/RectangleSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def rectangle-sharp (create-svg-icon (e "path" #js {"d" "M2 4h20v16H2z"})
                                      "RectangleSharp"))
