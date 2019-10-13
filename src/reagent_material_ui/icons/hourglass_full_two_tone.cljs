(ns reagent-material-ui.icons.hourglass-full-two-tone
  "Imports @material-ui/icons/HourglassFullTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def hourglass-full-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M8 7.5l4 4 4-4V4H8zm0 9V20h8v-3.5l-4-4z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6v6h.01L6 8.01 10 12l-4 4 .01.01H6V22h12v-5.99h-.01L18 16l-4-4 4-3.99-.01-.01H18V2zm-2 14.5V20H8v-3.5l4-4 4 4zm0-9l-4 4-4-4V4h8v3.5z"}))
                                              "HourglassFullTwoTone"))
