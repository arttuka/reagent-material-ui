(ns reagent-material-ui.icons.details-two-tone
  "Imports @material-ui/icons/DetailsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def details-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M6.38 6L12 16l5.63-10z", "opacity" ".3"}) (e "path" #js {"d" "M3 4l9 16 9-16H3zm3.38 2h11.25L12 16 6.38 6z"}))
                                       "DetailsTwoTone"))
