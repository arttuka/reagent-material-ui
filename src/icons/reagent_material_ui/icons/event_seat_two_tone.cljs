(ns reagent-material-ui.icons.event-seat-two-tone
  "Imports @material-ui/icons/EventSeatTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-seat-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9 5h6v7H9z", "opacity" ".3"}) (e "path" #js {"d" "M4 21h2v-4h12v4h2v-6H4zM17 5c0-1.1-.9-2-2-2H9c-1.1 0-2 .9-2 2v9h10V5zm-2 7H9V5h6v7zm4-2h3v3h-3zM2 10h3v3H2z"}))
                                          "EventSeatTwoTone"))
