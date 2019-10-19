(ns reagent-material-ui.icons.edit-location-sharp
  "Imports @material-ui/icons/EditLocationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def edit-location-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 2C8.14 2 5 5.14 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.86-3.14-7-7-7zM9.95 12.49H8.51v-1.44l3.93-3.92 1.43 1.43-3.92 3.93zm5.34-5.34l-.7.7-1.44-1.44.7-.7c.15-.15.39-.15.54 0l.9.9c.15.15.15.39 0 .54z"}))
                                          "EditLocationSharp"))
