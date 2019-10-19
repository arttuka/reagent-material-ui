(ns reagent-material-ui.icons.text-rotation-none-two-tone
  "Imports @material-ui/icons/TextRotationNoneTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-rotation-none-two-tone (create-svg-icon (e "path" #js {"d" "M21 18l-3-3v2H5v2h13v2l3-3zM9.5 11.8h5l.9 2.2h2.1L12.75 3h-1.5L6.5 14h2.1l.9-2.2zM12 4.98L13.87 10h-3.74L12 4.98z"})
                                                  "TextRotationNoneTwoTone"))
