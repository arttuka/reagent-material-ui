(ns reagent-material-ui.icons.add-to-queue-sharp
  "Imports @material-ui/icons/AddToQueueSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-to-queue-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v16h7v2h8v-2h7V3zm-2 14H3V5h18v12zm-5-7v2h-3v3h-2v-3H8v-2h3V7h2v3h3z"})
                                         "AddToQueueSharp"))
