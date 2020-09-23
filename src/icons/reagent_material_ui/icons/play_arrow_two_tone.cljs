(ns reagent-material-ui.icons.play-arrow-two-tone
  "Imports @material-ui/icons/PlayArrowTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-arrow-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10 8.64v6.72L15.27 12z", "opacity" ".3"}) (e "path" #js {"d" "M8 19l11-7L8 5v14zm2-10.36L15.27 12 10 15.36V8.64z"}))
                                          "PlayArrowTwoTone"))
