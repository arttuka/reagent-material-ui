(ns reagent-mui.icons.arrow-drop-up-sharp
  "Imports @mui/icons-material/ArrowDropUpSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-drop-up-sharp (create-svg-icon (e "path" #js {"d" "m7 14 5-5 5 5H7z"})
                                          "ArrowDropUpSharp"))
