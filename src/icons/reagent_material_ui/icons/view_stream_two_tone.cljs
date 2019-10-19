(ns reagent-material-ui.icons.view-stream-two-tone
  "Imports @material-ui/icons/ViewStreamTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-stream-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M6 13h13v3H6zm0-5h13v3H6z", "opacity" ".3"}) (e "path" #js {"d" "M4 6v12h17V6H4zm15 10H6v-3h13v3zm0-5H6V8h13v3z"}))
                                           "ViewStreamTwoTone"))
