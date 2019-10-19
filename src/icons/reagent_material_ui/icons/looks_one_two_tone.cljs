(ns reagent-material-ui.icons.looks-one-two-tone
  "Imports @material-ui/icons/LooksOneTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-one-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M19 5H5v14h14V5zm-5 12h-2V9h-2V7h4v10z", "opacity" ".3"}) (e "path" #js {"d" "M5 21h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2zM5 5h14v14H5V5zm5 4h2v8h2V7h-4z"}))
                                         "LooksOneTwoTone"))
