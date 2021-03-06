(ns reagent-material-ui.icons.video-camera-back-sharp
  "Imports @material-ui/icons/VideoCameraBackSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-camera-back-sharp (create-svg-icon (e "path" #js {"d" "M18 10.48V4H2v16h16v-6.48l4 3.98v-11l-4 3.98zM5 16l2.38-3.17L9 15l2.62-3.5L15 16H5z"})
                                              "VideoCameraBackSharp"))
