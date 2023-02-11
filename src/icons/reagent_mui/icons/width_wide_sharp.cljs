(ns reagent-mui.icons.width-wide-sharp
  "Imports @mui/icons-material/WidthWideSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def width-wide-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM4 6h2v12H4V6zm16 12h-2V6h2v12z"})
                                       "WidthWideSharp"))
