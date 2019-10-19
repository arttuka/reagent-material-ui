(ns reagent-material-ui.icons.stay-primary-portrait-two-tone
  "Imports @material-ui/icons/StayPrimaryPortraitTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def stay-primary-portrait-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M7 5h10v14H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 1.01L7 1c-1.1 0-1.99.9-1.99 2v18c0 1.1.89 2 1.99 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 19H7V5h10v14z"}))
                                                     "StayPrimaryPortraitTwoTone"))
