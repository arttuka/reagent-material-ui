(ns reagent-material-ui.icons.signal-wifi-3-bar-lock-sharp
  "Imports @material-ui/icons/SignalWifi3BarLockSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-wifi-3-bar-lock-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 14.5c0-2.8 2.2-5 5-5 .36 0 .71.04 1.05.11L23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7L12 21.5l3.5-4.36V14.5z", "fillOpacity" ".3"}) (e "path" #js {"d" "M23 16v-1.34c0-1.47-1.2-2.75-2.66-2.66-1.33.09-2.34 1.16-2.34 2.5V16h-1v6h7v-6h-1zm-1 0h-3v-1.5c0-.8.7-1.5 1.5-1.5s1.5.7 1.5 1.5V16zm-6.5-1.5c0-2.19 1.35-3.99 3.27-4.68C17.29 8.98 14.94 8 12 8c-4.81 0-8.04 2.62-8.47 2.95L12 21.5l3.5-4.36V14.5z"}))
                                                   "SignalWifi3BarLockSharp"))
