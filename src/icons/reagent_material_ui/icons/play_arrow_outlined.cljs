(ns reagent-material-ui.icons.play-arrow-outlined
  "Imports @material-ui/icons/PlayArrowOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-arrow-outlined (create-svg-icon (e "path" #js {"d" "M10 8.64L15.27 12 10 15.36V8.64M8 5v14l11-7L8 5z"})
                                          "PlayArrowOutlined"))
