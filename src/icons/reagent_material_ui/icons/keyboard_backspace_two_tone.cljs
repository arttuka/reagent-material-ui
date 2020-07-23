(ns reagent-material-ui.icons.keyboard-backspace-two-tone
  "Imports @material-ui/icons/KeyboardBackspaceTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-backspace-two-tone (create-svg-icon (e "path" #js {"d" "M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21v-2z"})
                                                  "KeyboardBackspaceTwoTone"))
