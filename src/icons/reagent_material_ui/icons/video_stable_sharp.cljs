(ns reagent-material-ui.icons.video-stable-sharp
  "Imports @material-ui/icons/VideoStableSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-stable-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h20V4H2zm2 14V6h2.95l-2.33 8.73L16.82 18H4zm16 0h-2.95l2.34-8.73L7.18 6H20v12z"})
                                         "VideoStableSharp"))
