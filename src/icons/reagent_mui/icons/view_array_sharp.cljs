(ns reagent-mui.icons.view-array-sharp
  "Imports @mui/icons-material/ViewArraySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-array-sharp (create-svg-icon (e "path" #js {"d" "M21 5h-3v14h3V5zm-4 0H7v14h10V5zM6 5H3v14h3V5z"})
                                       "ViewArraySharp"))
