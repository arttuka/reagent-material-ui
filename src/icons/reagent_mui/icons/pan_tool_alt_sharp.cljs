(ns reagent-mui.icons.pan-tool-alt-sharp
  "Imports @mui/icons-material/PanToolAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pan-tool-alt-sharp (create-svg-icon (e "path" #js {"d" "M20.18 13.4 19.1 21h-9L5 15.62l1.22-1.23 3.78.85V4.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v6h1.38l5.8 2.9z"})
                                         "PanToolAltSharp"))
