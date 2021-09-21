(ns reagent-mui.icons.calendar-view-day
  "Imports @mui/icons-material/CalendarViewDay as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def calendar-view-day (create-svg-icon (e "path" #js {"d" "M3 17h18v2H3zm0-7h18v5H3zm0-4h18v2H3z"})
                                        "CalendarViewDay"))
