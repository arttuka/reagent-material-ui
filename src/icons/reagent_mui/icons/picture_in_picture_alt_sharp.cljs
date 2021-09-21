(ns reagent-mui.icons.picture-in-picture-alt-sharp
  "Imports @mui/icons-material/PictureInPictureAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def picture-in-picture-alt-sharp (create-svg-icon (e "path" #js {"d" "M19 11h-8v6h8v-6zm4 10V3H1v18h22zm-2-1.98H3V4.97h18v14.05z"})
                                                   "PictureInPictureAltSharp"))
