(ns reagent-mui.icons.timer-outlined
  "Imports @mui/icons-material/TimerOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def timer-outlined (create-svg-icon (e "path" #js {"d" "M15.07 1.01h-6v2h6v-2zm-4 13h2v-6h-2v6zm8.03-6.62 1.42-1.42c-.43-.51-.9-.99-1.41-1.41l-1.42 1.42C16.14 4.74 14.19 4 12.07 4c-4.97 0-9 4.03-9 9s4.02 9 9 9 9-4.03 9-9c0-2.11-.74-4.06-1.97-5.61zm-7.03 12.62c-3.87 0-7-3.13-7-7s3.13-7 7-7 7 3.13 7 7-3.13 7-7 7z"})
                                     "TimerOutlined"))
