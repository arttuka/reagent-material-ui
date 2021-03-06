(ns reagent-material-ui.icons.door-sliding-sharp
  "Imports @material-ui/icons/DoorSlidingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def door-sliding-sharp (create-svg-icon (e "path" #js {"d" "M20 19V3h-7.25v16h-1.5V3H4v16H3v2h18v-2h-1zm-10-6H8v-2h2v2zm6 0h-2v-2h2v2z"})
                                         "DoorSlidingSharp"))
