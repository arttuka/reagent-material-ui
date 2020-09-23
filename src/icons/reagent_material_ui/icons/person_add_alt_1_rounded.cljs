(ns reagent-material-ui.icons.person-add-alt-1-rounded
  "Imports @material-ui/icons/PersonAddAlt1Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def person-add-alt-1-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "8", "r" "4", "cx" "9"}) (e "path" #js {"d" "M9 14c-2.67 0-8 1.34-8 4v1c0 .55.45 1 1 1h14c.55 0 1-.45 1-1v-1c0-2.66-5.33-4-8-4zM20 10V7h-2v3h-3v2h3v3h2v-3h3v-2z"}))
                                               "PersonAddAlt1Rounded"))
