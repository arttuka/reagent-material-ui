(ns reagent-material-ui.icons.view-agenda-two-tone
  "Imports @material-ui/icons/ViewAgendaTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-agenda-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20 3H3c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h17c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1zm-1 6H4V5h15v4zm1 4H3c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h17c.55 0 1-.45 1-1v-6c0-.55-.45-1-1-1zm-1 6H4v-4h15v4z"}) (e "path" #js {"d" "M4 15h15v4H4zM4 5h15v4H4z", "opacity" ".3"}))
                                           "ViewAgendaTwoTone"))
