(ns reagent-material-ui.icons.meeting-room-outlined
  "Imports @material-ui/icons/MeetingRoomOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def meeting-room-outlined (create-svg-icon (e "path" #js {"d" "M19 19V4h-4V3H5v16H3v2h12V6h2v15h4v-2h-2zm-6 0H7V5h6v14zm-3-8h2v2h-2z"})
                                            "MeetingRoomOutlined"))
