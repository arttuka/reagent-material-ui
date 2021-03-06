(ns reagent-material-ui.icons.door-back-two-tone
  "Imports @material-ui/icons/DoorBackTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def door-back-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 19h10V5H7v14zm2-8h2v2H9v-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 19V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v14H3v2h18v-2h-2zm-2 0H7V5h10v14z"}) (e "path" #js {"d" "M9 11h2v2H9z"}))
                                         "DoorBackTwoTone"))
