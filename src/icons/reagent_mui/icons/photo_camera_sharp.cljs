(ns reagent-mui.icons.photo-camera-sharp
  "Imports @mui/icons-material/PhotoCameraSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-camera-sharp (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "12", "r" "3"}) (e "path" #js {"d" "M9 2 7.17 4H2v16h20V4h-5.17L15 2H9zm3 15c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})]
                                         "PhotoCameraSharp"))
