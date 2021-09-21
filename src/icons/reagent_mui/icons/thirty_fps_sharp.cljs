(ns reagent-mui.icons.thirty-fps-sharp
  "Imports @mui/icons-material/ThirtyFpsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def thirty-fps-sharp (create-svg-icon (e "path" #js {"d" "M2 5v3h6v2.5H3v3h5V16H2v3h9V5H2zm17 3v8h-4V8h4m3-3H12v14h10V5z"})
                                       "ThirtyFpsSharp"))
