(ns reagent-material-ui.icons.movie-creation-two-tone
  "Imports @material-ui/icons/MovieCreationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def movie-creation-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M4 6.47V18h16v-8H5.76z", "opacity" ".3"}) (e "path" #js {"d" "M18 4l2 4h-3l-2-4h-2l2 4h-3l-2-4H8l2 4H7L5 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4h-4zm2 14H4V6.47L5.76 10H20v8z"}))
                                              "MovieCreationTwoTone"))
