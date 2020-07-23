(ns reagent-material-ui.icons.remove-from-queue-sharp
  "Imports @material-ui/icons/RemoveFromQueueSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def remove-from-queue-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v16h7v2h8v-2h7V3zm-2 14H3V5h18v12zm-5-7v2H8v-2h8z"})
                                              "RemoveFromQueueSharp"))
