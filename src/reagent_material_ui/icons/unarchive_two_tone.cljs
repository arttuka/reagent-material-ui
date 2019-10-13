(ns reagent-material-ui.icons.unarchive-two-tone
  "Imports @material-ui/icons/UnarchiveTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def unarchive-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M5 19h14V8H5v11zm7-9l4 4h-2.55v3h-2.91v-3H8l4-4z", "opacity" ".3"}) (e "path" #js {"d" "M20.54 5.23l-1.39-1.68C18.88 3.21 18.47 3 18 3H6c-.47 0-.88.21-1.16.55L3.46 5.23C3.17 5.57 3 6.02 3 6.5V19c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6.5c0-.48-.17-.93-.46-1.27zM6.24 5h11.52l.83 1H5.42l.82-1zM19 19H5V8h14v11zm-8.45-2h2.9v-3H16l-4-4-4 4h2.55z"}))
                                         "UnarchiveTwoTone"))
