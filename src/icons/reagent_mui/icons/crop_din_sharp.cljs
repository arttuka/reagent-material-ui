(ns reagent-mui.icons.crop-din-sharp
  "Imports @mui/icons-material/CropDinSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-din-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2 16H5V5h14v14z"})
                                     "CropDinSharp"))
