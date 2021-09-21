(ns reagent-mui.icons.crop-portrait-sharp
  "Imports @mui/icons-material/CropPortraitSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-portrait-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18h14V3zm-2 16H7V5h10v14z"})
                                          "CropPortraitSharp"))
