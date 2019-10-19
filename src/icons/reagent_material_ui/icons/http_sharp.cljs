(ns reagent-material-ui.icons.http-sharp
  "Imports @material-ui/icons/HttpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def http-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 24H0V0h24v24z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M4.5 11h-2V9H1v6h1.5v-2.5h2V15H6V9H4.5v2zm2.5-.5h1.5V15H10v-4.5h1.5V9H7v1.5zm5.5 0H14V15h1.5v-4.5H17V9h-4.5v1.5zM23 9h-5v6h1.5v-2H23V9zm-1.5 2.5h-2v-1h2v1z"}))
                                 "HttpSharp"))
