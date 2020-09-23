(ns reagent-material-ui.icons.play-arrow-sharp
  "Imports @material-ui/icons/PlayArrowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-arrow-sharp (create-svg-icon (e "path" #js {"d" "M8 5v14l11-7L8 5z"})
                                       "PlayArrowSharp"))
