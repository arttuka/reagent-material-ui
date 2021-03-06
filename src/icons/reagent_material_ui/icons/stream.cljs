(ns reagent-material-ui.icons.stream
  "Imports @material-ui/icons/Stream as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stream (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "2", "cx" "20"}) (e "circle" #js {"cy" "12", "r" "2", "cx" "4"}) (e "circle" #js {"cy" "20", "r" "2", "cx" "12"}) (e "path" #js {"d" "M10.05 8.59L6.03 4.55h-.01l-.31-.32-1.42 1.41 4.02 4.05.01-.01.31.32zm3.893.027l4.405-4.392L19.76 5.64l-4.405 4.393zM10.01 15.36l-1.42-1.41-4.03 4.01-.32.33 1.41 1.41 4.03-4.02zm9.75 2.94l-3.99-4.01-.36-.35L14 15.35l3.99 4.01.35.35z"}) (e "circle" #js {"cy" "4", "r" "2", "cx" "12"}))
                             "Stream"))
