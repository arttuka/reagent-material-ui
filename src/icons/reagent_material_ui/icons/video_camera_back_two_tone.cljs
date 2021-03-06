(ns reagent-material-ui.icons.video-camera-back-two-tone
  "Imports @material-ui/icons/VideoCameraBackTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-camera-back-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 18h12V6H4v12zm3.38-5.17L9 15l2.62-3.5L15 16H5l2.38-3.17z", "opacity" ".3"}) (e "path" #js {"d" "M11.62 11.5L9 15l-1.62-2.17L5 16h10z"}) (e "path" #js {"d" "M18 10.48V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-4.48l4 3.98v-11l-4 3.98zM16 18H4V6h12v12z"}))
                                                 "VideoCameraBackTwoTone"))
