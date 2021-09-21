(ns reagent-mui.icons.view-compact-sharp
  "Imports @mui/icons-material/ViewCompactSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-compact-sharp (create-svg-icon (e "path" #js {"d" "M3 19h6v-7H3v7zm7 0h12v-7H10v7zM3 5v6h19V5H3z"})
                                         "ViewCompactSharp"))
