(ns reagent-material-ui.icons.insert-invitation-two-tone
  "Imports @material-ui/icons/InsertInvitationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-invitation-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 5H5v2h14z", "opacity" ".3"}) (e "path" #js {"d" "M5 21h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2h-1V1h-2v2H8V1H6v2H5c-1.11 0-1.99.9-1.99 2L3 19c0 1.1.89 2 2 2zM5 7V5h14v2H5zm0 2h14v10H5V9zm7 3h5v5h-5z"}))
                                                 "InsertInvitationTwoTone"))
