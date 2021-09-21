(ns reagent-mui.icons.equalizer-sharp
  "Imports @mui/icons-material/EqualizerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def equalizer-sharp (create-svg-icon (e "path" #js {"d" "M10 20h4V4h-4v16zm-6 0h4v-8H4v8zM16 9v11h4V9h-4z"})
                                      "EqualizerSharp"))
