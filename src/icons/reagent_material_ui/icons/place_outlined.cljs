(ns reagent-material-ui.icons.place-outlined
  "Imports @material-ui/icons/PlaceOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def place-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zM7 9c0-2.76 2.24-5 5-5s5 2.24 5 5c0 2.88-2.88 7.19-5 9.88C9.92 16.21 7 11.85 7 9z"}) (e "circle" #js {"cy" "9", "r" "2.5", "cx" "12"}))
                                     "PlaceOutlined"))
