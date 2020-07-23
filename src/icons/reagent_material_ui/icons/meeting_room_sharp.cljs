(ns reagent-material-ui.icons.meeting-room-sharp
  "Imports @material-ui/icons/MeetingRoomSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def meeting-room-sharp (create-svg-icon (e "path" #js {"d" "M14 6v15H3v-2h2V3h9v1h5v15h2v2h-4V6h-3zm-4 5v2h2v-2h-2z"})
                                         "MeetingRoomSharp"))
