(ns reagent-mui.icons.schedule-send-rounded
  "Imports @mui/icons-material/ScheduleSendRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def schedule-send-rounded (create-svg-icon [(e "path" #js {"d" "M17 10c.1 0 .19.01.28.01L4.39 4.58C3.73 4.31 3 4.79 3 5.51v3.71c0 .46.31.86.76.97L11 12l-7.24 1.81c-.45.11-.76.51-.76.97v3.71c0 .72.73 1.2 1.39.92L10 17.05V17c0-3.86 3.14-7 7-7z"}) (e "path" #js {"d" "M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm1.29 7-1.65-1.65c-.09-.09-.15-.22-.15-.35v-2.5c0-.28.22-.5.5-.5s.5.22.5.5v2.29l1.5 1.5c.2.2.2.51 0 .71-.19.2-.5.2-.7 0z"})]
                                            "ScheduleSendRounded"))
