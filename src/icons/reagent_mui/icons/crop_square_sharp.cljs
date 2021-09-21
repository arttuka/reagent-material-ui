(ns reagent-mui.icons.crop-square-sharp
  "Imports @mui/icons-material/CropSquareSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-square-sharp (create-svg-icon (e "path" #js {"d" "M20 4H4v16h16V4zm-2 14H6V6h12v12z"})
                                        "CropSquareSharp"))
