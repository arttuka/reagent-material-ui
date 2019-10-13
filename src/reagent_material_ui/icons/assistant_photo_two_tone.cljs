(ns reagent-material-ui.icons.assistant-photo-two-tone
  "Imports @material-ui/icons/AssistantPhotoTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def assistant-photo-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M14.24 12l.4 2H18V8h-5.24l-.4-2H7v6z", "opacity" ".3"}) (e "path" #js {"d" "M7 14h5.6l.4 2h7V6h-5.6L14 4H5v17h2v-7zm0-8h5.36l.4 2H18v6h-3.36l-.4-2H7V6z"}))
                                               "AssistantPhotoTwoTone"))
