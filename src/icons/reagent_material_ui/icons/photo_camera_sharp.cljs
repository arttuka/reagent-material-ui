(ns reagent-material-ui.icons.photo-camera-sharp
  "Imports @material-ui/icons/PhotoCameraSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-camera-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}) (e "path" #js {"d" "M9 2L7.17 4H2v16h20V4h-5.17L15 2H9zm3 15c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}))
                                         "PhotoCameraSharp"))
