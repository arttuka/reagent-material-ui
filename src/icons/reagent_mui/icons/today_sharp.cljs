(ns reagent-mui.icons.today-sharp
  "Imports @mui/icons-material/TodaySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def today-sharp (create-svg-icon (e "path" #js {"d" "M21 3h-3V1h-2v2H8V1H6v2H3v18h18V3zm-2 16H5V8h14v11zM7 10h5v5H7v-5z"})
                                  "TodaySharp"))
