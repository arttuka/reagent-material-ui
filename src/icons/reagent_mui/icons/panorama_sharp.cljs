(ns reagent-mui.icons.panorama-sharp
  "Imports @mui/icons-material/PanoramaSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-sharp (create-svg-icon (e "path" #js {"d" "M23 20V4H1v16h22zM8.5 12.5l2.5 3.01L14.5 11l4.5 6H5l3.5-4.5z"})
                                     "PanoramaSharp"))
