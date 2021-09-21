(ns reagent-mui.icons.pause-presentation-sharp
  "Imports @mui/icons-material/PausePresentationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pause-presentation-sharp (create-svg-icon (e "path" #js {"d" "M1 3v18h22V3H1zm20 16H3V5h18v14zM9 8h2v8H9zm4 0h2v8h-2z"})
                                               "PausePresentationSharp"))
