(ns reagent-mui.icons.photo-size-select-actual-sharp
  "Imports @mui/icons-material/PhotoSizeSelectActualSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-size-select-actual-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zM5 17l3.5-4.5 2.5 3.01L14.5 11l4.5 6H5z"})
                                                     "PhotoSizeSelectActualSharp"))
