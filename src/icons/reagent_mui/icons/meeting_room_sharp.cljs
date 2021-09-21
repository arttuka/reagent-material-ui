(ns reagent-mui.icons.meeting-room-sharp
  "Imports @mui/icons-material/MeetingRoomSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def meeting-room-sharp (create-svg-icon (e "path" #js {"d" "M14 6v15H3v-2h2V3h9v1h5v15h2v2h-4V6h-3zm-4 5v2h2v-2h-2z"})
                                         "MeetingRoomSharp"))
