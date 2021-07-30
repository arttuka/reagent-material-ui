(ns reagent-material-ui.icons.meeting-room-two-tone
  "Imports @material-ui/icons/MeetingRoomTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def meeting-room-two-tone (create-svg-icon [(e "path" #js {"d" "M7 19h6V5H7v14zm3-8h2v2h-2v-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 19V4h-4V3H5v16H3v2h12V6h2v15h4v-2h-2zm-6 0H7V5h6v14zm-3-8h2v2h-2z"})]
                                            "MeetingRoomTwoTone"))
