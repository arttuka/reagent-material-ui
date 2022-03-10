(ns reagent-mui.icons.wifi-2-bar-rounded
  "Imports @mui/icons-material/Wifi2BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-2-bar-rounded (create-svg-icon (e "path" #js {"d" "M12 16c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm-6.62-1.63c-.63-.63-.59-1.71.13-2.24C7.33 10.79 9.57 10 12 10c2.43 0 4.67.79 6.49 2.13.72.53.76 1.6.13 2.24-.53.54-1.37.57-1.98.12C15.33 13.55 13.73 13 12 13c-1.73 0-3.33.55-4.64 1.49-.61.44-1.45.41-1.98-.12z"})
                                         "Wifi2BarRounded"))
