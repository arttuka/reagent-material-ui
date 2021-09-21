(ns reagent-mui.icons.headphones-battery-rounded
  "Imports @mui/icons-material/HeadphonesBatteryRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def headphones-battery-rounded (create-svg-icon (e "path" #js {"d" "M21 7h-1v-.5c0-.28-.22-.5-.5-.5h-1c-.28 0-.5.22-.5.5V7h-1c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h4c.55 0 1-.45 1-1V8c0-.55-.45-1-1-1zM8 6c-3.31 0-6 2.69-6 6v4c0 1.1.9 2 2 2s2-.9 2-2v-1c0-1.1-.9-2-2-2h-.5v-1c0-2.48 2.02-4.5 4.5-4.5s4.5 2.02 4.5 4.5v1H12c-1.1 0-2 .9-2 2v1c0 1.1.9 2 2 2s2-.9 2-2v-4c0-3.31-2.69-6-6-6z"})
                                                 "HeadphonesBatteryRounded"))
