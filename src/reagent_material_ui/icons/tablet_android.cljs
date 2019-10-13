(ns reagent-material-ui.icons.tablet-android
  "Imports @material-ui/icons/TabletAndroid as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def tablet-android (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0z", "id" "a"})) (e "path" #js {"d" "M18 0H6C4.34 0 3 1.34 3 3v18c0 1.66 1.34 3 3 3h12c1.66 0 3-1.34 3-3V3c0-1.66-1.34-3-3-3zm-4 22h-4v-1h4v1zm5.25-3H4.75V3h14.5v16z"}))
                                     "TabletAndroid"))
