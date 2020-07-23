(ns reagent-material-ui.icons.video-label-sharp
  "Imports @material-ui/icons/VideoLabelSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-label-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 13H3V5h18v11z"})
                                        "VideoLabelSharp"))
