(ns reagent-material-ui.icons.door-front-two-tone
  "Imports @material-ui/icons/DoorFrontTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def door-front-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 19h10V5H7v14zm6-8h2v2h-2v-2z", "opacity" ".3"}) (e "path" #js {"d" "M13 11h2v2h-2z"}) (e "path" #js {"d" "M19 19V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v14H3v2h18v-2h-2zm-2 0H7V5h10v14z"}))
                                          "DoorFrontTwoTone"))
