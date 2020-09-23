(ns reagent-material-ui.icons.calendar-today-sharp
  "Imports @material-ui/icons/CalendarTodaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def calendar-today-sharp (create-svg-icon (e "path" #js {"d" "M22 3h-3V1h-2v2H7V1H5v2H2v20h20V3zm-2 18H4V8h16v13z"})
                                           "CalendarTodaySharp"))
