(ns reagent-material-ui.icons.video-camera-back
  "Imports @material-ui/icons/VideoCameraBack as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-camera-back (create-svg-icon (e "path" #js {"d" "M18 10.48V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-4.48l4 3.98v-11l-4 3.98zM5 16l2.38-3.17L9 15l2.62-3.5L15 16H5z"})
                                        "VideoCameraBack"))
