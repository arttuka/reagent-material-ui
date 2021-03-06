(ns reagent-material-ui.icons.photo-camera-back-sharp
  "Imports @material-ui/icons/PhotoCameraBackSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-camera-back-sharp (create-svg-icon (e "path" #js {"d" "M16.83 5L15 3H9L7.17 5H2v16h20V5h-5.17zM6 17l3-4 2.25 3 3-4L18 17H6z"})
                                              "PhotoCameraBackSharp"))
