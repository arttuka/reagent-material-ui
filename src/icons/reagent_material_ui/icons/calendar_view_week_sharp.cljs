(ns reagent-material-ui.icons.calendar-view-week-sharp
  "Imports @material-ui/icons/CalendarViewWeekSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def calendar-view-week-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zm-9 2h2.5v12H13V6zm-2 12H8.5V6H11v12zM4 6h2.5v12H4V6zm16 12h-2.5V6H20v12z"})
                                               "CalendarViewWeekSharp"))
