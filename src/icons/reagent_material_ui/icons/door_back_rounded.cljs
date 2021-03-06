(ns reagent-material-ui.icons.door-back-rounded
  "Imports @material-ui/icons/DoorBackRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def door-back-rounded (create-svg-icon (e "path" #js {"d" "M20 19h-1V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v14H4c-.55 0-1 .45-1 1s.45 1 1 1h16c.55 0 1-.45 1-1s-.45-1-1-1zm-10-6c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                        "DoorBackRounded"))
