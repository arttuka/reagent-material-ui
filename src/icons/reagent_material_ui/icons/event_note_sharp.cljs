(ns reagent-material-ui.icons.event-note-sharp
  "Imports @material-ui/icons/EventNoteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-note-sharp (create-svg-icon (e "path" #js {"d" "M17 10H7v2h10v-2zm4-7h-3V1h-2v2H8V1H6v2H3v18h18V3zm-2 16H5V8h14v11zm-5-5H7v2h7v-2z"})
                                       "EventNoteSharp"))
