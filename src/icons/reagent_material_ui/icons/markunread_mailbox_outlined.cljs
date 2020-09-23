(ns reagent-material-ui.icons.markunread-mailbox-outlined
  "Imports @material-ui/icons/MarkunreadMailboxOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def markunread-mailbox-outlined (create-svg-icon (e "path" #js {"d" "M20 6H10v2h10v12H4V8h2v4h2V4h6V0H6v6H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2z"})
                                                  "MarkunreadMailboxOutlined"))
