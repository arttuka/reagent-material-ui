(ns reagent-mui.icons.calendar-view-day-two-tone
  "Imports @mui/icons-material/CalendarViewDayTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def calendar-view-day-two-tone (create-svg-icon [(e "path" #js {"d" "M3 17h18v2H3zm16-5v1H5v-1h14m2-2H3v5h18v-5zM3 6h18v2H3z"}) (e "path" #js {"d" "M5 12h14v1H5z", "opacity" ".3"})]
                                                 "CalendarViewDayTwoTone"))
