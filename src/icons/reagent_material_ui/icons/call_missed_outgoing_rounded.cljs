(ns reagent-material-ui.icons.call-missed-outgoing-rounded
  "Imports @material-ui/icons/CallMissedOutgoingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-missed-outgoing-rounded (create-svg-icon (e "path" #js {"d" "M3.7 7.7c.39-.39 1.02-.39 1.41 0L12 14.59l4.29-4.3L14.7 8.7c-.62-.62-.18-1.7.71-1.7H20c.55 0 1 .45 1 1v4.59c0 .89-1.08 1.34-1.71.71l-1.59-1.59-5 5c-.39.39-1.02.39-1.41 0L3.7 9.11c-.38-.38-.38-1.02 0-1.41z"})
                                                   "CallMissedOutgoingRounded"))
