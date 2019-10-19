(ns reagent-material-ui.icons.stay-primary-landscape-two-tone
  "Imports @material-ui/icons/StayPrimaryLandscapeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def stay-primary-landscape-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M5 7h14v10H5z", "opacity" ".3"}) (e "path" #js {"d" "M21 5H3c-1.1 0-1.99.9-1.99 2L1 17c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm-2 12H5V7h14v10z"}))
                                                      "StayPrimaryLandscapeTwoTone"))
