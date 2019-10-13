(ns reagent-material-ui.icons.pause-presentation-two-tone
  "Imports @material-ui/icons/PausePresentationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def pause-presentation-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M3 19h18V5H3v14zM13 8h2v8h-2V8zM9 8h2v8H9V8z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H3V5h18v14zM9 8h2v8H9zm4 0h2v8h-2z"}))
                                                  "PausePresentationTwoTone"))
