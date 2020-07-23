(ns reagent-material-ui.icons.calendar-view-day-outlined
  "Imports @material-ui/icons/CalendarViewDayOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def calendar-view-day-outlined (create-svg-icon (e "path" #js {"d" "M3 17h18v2H3zm16-5v1H5v-1h14m2-2H3v5h18v-5zM3 6h18v2H3z"})
                                                 "CalendarViewDayOutlined"))
