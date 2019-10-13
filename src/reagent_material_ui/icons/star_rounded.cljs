(ns reagent-material-ui.icons.star-rounded
  "Imports @material-ui/icons/StarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def star-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "g" #js {"fill" "none"} (e "path" #js {"d" "M0 0h24v24H0V0z"}) (e "path" #js {"d" "M0 0h24v24H0V0z"})) (e "path" #js {"d" "M12 17.27l4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"}))
                                   "StarRounded"))
