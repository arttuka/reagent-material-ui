(ns reagent-mui.icons.notifications-paused-sharp
  "Imports @mui/icons-material/NotificationsPausedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def notifications-paused-sharp (create-svg-icon (e "path" #js {"d" "M12 22c1.1 0 2-.9 2-2h-4c0 1.1.89 2 2 2zm6-6v-5c0-3.07-1.64-5.64-4.5-6.32V2.5h-3v2.18C7.63 5.36 6 7.93 6 11v5l-2 2v1h16v-1l-2-2zm-3.5-6.2-2.8 3.4h2.8V15h-5v-1.8l2.8-3.4H9.5V8h5v1.8z"})
                                                 "NotificationsPausedSharp"))
