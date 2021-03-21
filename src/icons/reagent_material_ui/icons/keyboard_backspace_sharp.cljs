(ns reagent-material-ui.icons.keyboard-backspace-sharp
  "Imports @material-ui/icons/KeyboardBackspaceSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-backspace-sharp (create-svg-icon (e "path" #js {"d" "M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21v-2z"})
                                               "KeyboardBackspaceSharp"))
