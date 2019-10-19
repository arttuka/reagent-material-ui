(ns reagent-material-ui.icons.email-two-tone
  "Imports @material-ui/icons/EmailTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def email-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20 8l-8 5-8-5v10h16zm0-2H4l8 4.99z", "opacity" ".3"}) (e "path" #js {"d" "M4 20h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2zM20 6l-8 4.99L4 6h16zM4 8l8 5 8-5v10H4V8z"}))
                                     "EmailTwoTone"))
