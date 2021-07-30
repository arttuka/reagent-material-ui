(ns reagent-material-ui.icons.photo-camera-sharp
  "Imports @material-ui/icons/PhotoCameraSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def photo-camera-sharp (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "12", "r" "3"}) (e "path" #js {"d" "M9 2 7.17 4H2v16h20V4h-5.17L15 2H9zm3 15c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})]
                                         "PhotoCameraSharp"))
