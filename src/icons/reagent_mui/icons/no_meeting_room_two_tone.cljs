(ns reagent-mui.icons.no-meeting-room-two-tone
  "Imports @mui/icons-material/NoMeetingRoomTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def no-meeting-room-two-tone (create-svg-icon [(e "path" #js {"d" "M12 5H8.12L12 8.88V6zM7 19h5v-4.46l-5-5z", "opacity" ".3"}) (e "path" #js {"d" "M12 5v3.88l2 2V6h3v7.88l2 2V4h-5V3H6.12l2 2zM2.41 2.13 1 3.54l4 4V19H3v2h11v-4.46L20.46 23l1.41-1.41L2.41 2.13zM12 19H7V9.54l5 5V19z"})]
                                               "NoMeetingRoomTwoTone"))
