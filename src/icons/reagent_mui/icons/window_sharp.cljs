(ns reagent-mui.icons.window-sharp
  "Imports @mui/icons-material/WindowSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def window-sharp (create-svg-icon (e "path" #js {"d" "M3 3h8v8H3zm10 0h8v8h-8zM3 13h8v8H3zm10 0h8v8h-8z"})
                                   "WindowSharp"))
