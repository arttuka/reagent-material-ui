(ns reagent-mui.icons.meeting-room-outlined
  "Imports @mui/icons-material/MeetingRoomOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def meeting-room-outlined (create-svg-icon (e "path" #js {"d" "M19 19V4h-4V3H5v16H3v2h12V6h2v15h4v-2h-2zm-6 0H7V5h6v14zm-3-8h2v2h-2z"})
                                            "MeetingRoomOutlined"))
