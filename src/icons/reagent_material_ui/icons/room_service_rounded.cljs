(ns reagent-material-ui.icons.room-service-rounded
  "Imports @material-ui/icons/RoomServiceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def room-service-rounded (create-svg-icon (e "path" #js {"d" "M22 18c0 .55-.45 1-1 1H3c-.55 0-1-.45-1-1s.45-1 1-1h18c.55 0 1 .45 1 1zm-1-2H3v-1c0-4.28 2.99-7.86 7-8.77V6c0-1.1.9-2 2-2s2 .9 2 2v.23c4.01.91 7 4.49 7 8.77v1z"})
                                           "RoomServiceRounded"))
