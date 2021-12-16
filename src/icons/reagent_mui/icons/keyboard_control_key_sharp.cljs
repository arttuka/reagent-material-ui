(ns reagent-mui.icons.keyboard-control-key-sharp
  "Imports @mui/icons-material/KeyboardControlKeySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-control-key-sharp (create-svg-icon (e "path" #js {"d" "m5 12 1.41 1.41L12 7.83l5.59 5.58L19 12l-7-7z"})
                                                 "KeyboardControlKeySharp"))
