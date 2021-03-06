(ns reagent-material-ui.icons.calendar-view-month-sharp
  "Imports @material-ui/icons/CalendarViewMonthSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def calendar-view-month-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM8 11H4V6h4v5zm6 0h-4V6h4v5zm6 0h-4V6h4v5zM8 18H4v-5h4v5zm6 0h-4v-5h4v5zm6 0h-4v-5h4v5z"})
                                                "CalendarViewMonthSharp"))
