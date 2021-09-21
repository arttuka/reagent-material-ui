(ns reagent-mui.icons.calendar-view-day-sharp
  "Imports @mui/icons-material/CalendarViewDaySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def calendar-view-day-sharp (create-svg-icon (e "path" #js {"d" "M3 17h18v2H3v-2zm0-7h18v5H3v-5zm0-4h18v2H3V6z"})
                                              "CalendarViewDaySharp"))
