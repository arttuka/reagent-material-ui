(ns reagent-mui.icons.photo-camera-back-sharp
  "Imports @mui/icons-material/PhotoCameraBackSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-camera-back-sharp (create-svg-icon (e "path" #js {"d" "M16.83 5 15 3H9L7.17 5H2v16h20V5h-5.17zM6 17l3-4 2.25 3 3-4L18 17H6z"})
                                              "PhotoCameraBackSharp"))
