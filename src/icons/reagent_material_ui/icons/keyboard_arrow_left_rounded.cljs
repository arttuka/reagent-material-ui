(ns reagent-material-ui.icons.keyboard-arrow-left-rounded
  "Imports @material-ui/icons/KeyboardArrowLeftRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-arrow-left-rounded (create-svg-icon (e "path" #js {"d" "M14.71 15.88L10.83 12l3.88-3.88c.39-.39.39-1.02 0-1.41a.9959.9959 0 00-1.41 0L8.71 11.3c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0 .38-.39.39-1.03 0-1.42z"})
                                                  "KeyboardArrowLeftRounded"))
