(ns reagent-material-ui.icons.play-arrow
  "Imports @material-ui/icons/PlayArrow as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-arrow (create-svg-icon (e "path" #js {"d" "M8 5v14l11-7z"})
                                 "PlayArrow"))
