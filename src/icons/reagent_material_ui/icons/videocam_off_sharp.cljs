(ns reagent-material-ui.icons.videocam-off-sharp
  "Imports @material-ui/icons/VideocamOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def videocam-off-sharp (create-svg-icon (e "path" #js {"d" "M21 16.61V6.5l-4 4V6h-6.61zM3.41 1.86L2 3.27 4.73 6H3v12h13.73l3 3 1.41-1.41z"})
                                         "VideocamOffSharp"))
