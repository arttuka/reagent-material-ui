(ns reagent-mui.icons.calendar-today-two-tone
  "Imports @mui/icons-material/CalendarTodayTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def calendar-today-two-tone (create-svg-icon [(e "path" #js {"d" "M20 3h-1V1h-2v2H7V1H5v2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 2v3H4V5h16zM4 21V10h16v11H4z"}) (e "path" #js {"d" "M4 5.01h16V8H4z", "opacity" ".3"})]
                                              "CalendarTodayTwoTone"))
