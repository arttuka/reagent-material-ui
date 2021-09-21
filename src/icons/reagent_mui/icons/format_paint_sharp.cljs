(ns reagent-mui.icons.format-paint-sharp
  "Imports @mui/icons-material/FormatPaintSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-paint-sharp (create-svg-icon (e "path" #js {"d" "M18 4V2H4v6h14V6h1v4H9v12h4V12h8V4h-3z"})
                                         "FormatPaintSharp"))
