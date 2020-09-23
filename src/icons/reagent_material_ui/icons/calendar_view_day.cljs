(ns reagent-material-ui.icons.calendar-view-day
  "Imports @material-ui/icons/CalendarViewDay as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def calendar-view-day (create-svg-icon (e "path" #js {"d" "M3 17h18v2H3zm0-7h18v5H3zm0-4h18v2H3z"})
                                        "CalendarViewDay"))
