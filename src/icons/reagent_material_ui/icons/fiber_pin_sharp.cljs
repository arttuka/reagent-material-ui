(ns reagent-material-ui.icons.fiber-pin-sharp
  "Imports @material-ui/icons/FiberPinSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-pin-sharp (create-svg-icon (e "path" #js {"d" "M5.5 10.5h2v1h-2v-1zM22 4H2v16h20V4zM9 13H5.5v2H4V9h5v4zm3.5 2H11V9h1.5v6zm7.5 0h-1.2l-2.55-3.5V15H15V9h1.25l2.5 3.5V9H20v6z"})
                                      "FiberPinSharp"))
