(ns reagent-mui.icons.camera-alt-sharp
  "Imports @mui/icons-material/CameraAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def camera-alt-sharp (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "12", "r" "3"}) (e "path" #js {"d" "M16.83 4 15 2H9L7.17 4H2v16h20V4h-5.17zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})]
                                       "CameraAltSharp"))
