(ns reagent-material-ui.icons.brightness-1-two-tone
  "Imports @material-ui/icons/Brightness1TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def brightness-1-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 20c4.41 0 8-3.59 8-8s-3.59-8-8-8-8 3.59-8 8 3.59 8 8 8z", "opacity" ".3"}) (e "path" #js {"d" "M12 22c5.52 0 10-4.48 10-10S17.52 2 12 2 2 6.48 2 12s4.48 10 10 10zm0-18c4.41 0 8 3.59 8 8s-3.59 8-8 8-8-3.59-8-8 3.59-8 8-8z"}))
                                            "Brightness1TwoTone"))
