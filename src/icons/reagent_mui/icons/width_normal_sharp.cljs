(ns reagent-mui.icons.width-normal-sharp
  "Imports @mui/icons-material/WidthNormalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def width-normal-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM4 6h4v12H4V6zm16 12h-4V6h4v12z"})
                                         "WidthNormalSharp"))
