(ns reagent-material-ui.icons.remove-from-queue-rounded
  "Imports @material-ui/icons/RemoveFromQueueRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def remove-from-queue-rounded (create-svg-icon (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h5v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h5c1.1 0 2-.9 2-2V5c0-1.11-.9-2-2-2zm-1 14H4c-.55 0-1-.45-1-1V6c0-.55.45-1 1-1h16c.55 0 1 .45 1 1v10c0 .55-.45 1-1 1zm-4-6c0 .55-.45 1-1 1H9c-.55 0-1-.45-1-1s.45-1 1-1h6c.55 0 1 .45 1 1z"})
                                                "RemoveFromQueueRounded"))
