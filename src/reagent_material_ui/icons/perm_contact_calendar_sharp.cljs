(ns reagent-material-ui.icons.perm-contact-calendar-sharp
  "Imports @material-ui/icons/PermContactCalendarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def perm-contact-calendar-sharp (create-svg-icon (e "path" #js {"d" "M21 3h-3V1h-2v2H8V1H6v2H3v18h18V3zm-9 3c1.66 0 3 1.34 3 3s-1.34 3-3 3-3-1.34-3-3 1.34-3 3-3zm6 12H6v-1c0-2 4-3.1 6-3.1s6 1.1 6 3.1v1z"})
                                                  "PermContactCalendarSharp"))
