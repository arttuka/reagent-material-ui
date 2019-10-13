(ns reagent-material-ui.icons.markunread-mailbox-sharp
  "Imports @material-ui/icons/MarkunreadMailboxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def markunread-mailbox-sharp (create-svg-icon (e "path" #js {"d" "M22 6H10v6H8V4h6V0H6v6H2v16h20V6z"})
                                               "MarkunreadMailboxSharp"))
