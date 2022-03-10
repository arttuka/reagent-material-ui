(ns reagent-mui.icons.wifi-2-bar
  "Imports @mui/icons-material/Wifi2Bar as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-2-bar (create-svg-icon (e "path" #js {"d" "M12 10c3.03 0 5.78 1.23 7.76 3.22l-2.12 2.12C16.2 13.9 14.2 13 12 13c-2.2 0-4.2.9-5.64 2.35l-2.12-2.12C6.22 11.23 8.97 10 12 10zm0 6c-1.38 0-2.63.56-3.53 1.46L12 21l3.53-3.54c-.9-.9-2.15-1.46-3.53-1.46z"})
                                 "Wifi2Bar"))
