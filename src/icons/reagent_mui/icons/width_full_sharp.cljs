(ns reagent-mui.icons.width-full-sharp
  "Imports @mui/icons-material/WidthFullSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def width-full-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM4 6h1v12H4V6zm16 12h-1V6h1v12z"})
                                       "WidthFullSharp"))
