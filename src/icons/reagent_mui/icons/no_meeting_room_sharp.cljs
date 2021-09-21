(ns reagent-mui.icons.no-meeting-room-sharp
  "Imports @mui/icons-material/NoMeetingRoomSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def no-meeting-room-sharp (create-svg-icon (e "path" #js {"d" "M14 6h3v7.88l2 2V4h-5V3H6.12L14 10.88zm-2 5.71V13h-2v-2h1.29L2.41 2.13 1 3.54l4 4V19H3v2h11v-4.46L20.46 23l1.41-1.41z"})
                                            "NoMeetingRoomSharp"))
