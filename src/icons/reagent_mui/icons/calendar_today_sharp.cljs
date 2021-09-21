(ns reagent-mui.icons.calendar-today-sharp
  "Imports @mui/icons-material/CalendarTodaySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def calendar-today-sharp (create-svg-icon (e "path" #js {"d" "M22 3h-3V1h-2v2H7V1H5v2H2v20h20V3zm-2 18H4V8h16v13z"})
                                           "CalendarTodaySharp"))
