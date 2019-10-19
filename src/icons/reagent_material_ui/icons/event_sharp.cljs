(ns reagent-material-ui.icons.event-sharp
  "Imports @material-ui/icons/EventSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-sharp (create-svg-icon (e "path" #js {"d" "M17 13h-5v5h5v-5zM16 2v2H8V2H6v2H3.01L3 22h18V4h-3V2h-2zm3 18H5V9h14v11z"})
                                  "EventSharp"))
