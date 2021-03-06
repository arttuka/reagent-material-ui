(ns reagent-material-ui.icons.view-compact-rounded
  "Imports @material-ui/icons/ViewCompactRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-compact-rounded (create-svg-icon (e "path" #js {"d" "M2 5v5c0 .55.45 1 1 1h18c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1zm9 15h10c.55 0 1-.45 1-1v-5c0-.55-.45-1-1-1H11c-.55 0-1 .45-1 1v5c0 .55.45 1 1 1zm-8 0h4c.55 0 1-.45 1-1v-5c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v5c0 .55.45 1 1 1z"})
                                           "ViewCompactRounded"))
