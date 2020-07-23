(ns reagent-material-ui.icons.markunread-mailbox-two-tone
  "Imports @material-ui/icons/MarkunreadMailboxTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def markunread-mailbox-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10 12H6V8H4v12h16V8H10z", "opacity" ".3"}) (e "path" #js {"d" "M20 6H10v2h10v12H4V8h2v4h2V4h6V0H6v6H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2z"}))
                                                  "MarkunreadMailboxTwoTone"))
