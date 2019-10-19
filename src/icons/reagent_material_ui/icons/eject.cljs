(ns reagent-material-ui.icons.eject
  "Imports @material-ui/icons/Eject as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def eject (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 24V0h24v24H0z", "fill" "none"}) (e "path" #js {"d" "M5 17h14v2H5zm7-12L5.33 15h13.34z"}))
                            "Eject"))
