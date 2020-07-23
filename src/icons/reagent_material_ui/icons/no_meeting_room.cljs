(ns reagent-material-ui.icons.no-meeting-room
  "Imports @material-ui/icons/NoMeetingRoom as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def no-meeting-room (create-svg-icon (e "path" #js {"d" "M11 11h-1v2h2v-1l9.73 9.73L20.46 23 14 16.54V21H3v-2h2V7.54l-4-4 1.27-1.27L11 11zm3 .49L5.51 3H14v1h5v12.49l-2-2V6h-3v5.49z"})
                                      "NoMeetingRoom"))
