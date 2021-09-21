(ns reagent-mui.icons.av-timer-two-tone
  "Imports @mui/icons-material/AvTimerTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def av-timer-two-tone (create-svg-icon [(e "path" #js {"d" "M12 21c4.97 0 9-4.03 9-9s-4.03-9-9-9h-1v4h2V5.08c3.39.49 6 3.39 6 6.92 0 3.87-3.13 7-7 7s-7-3.13-7-7c0-1.68.59-3.22 1.58-4.42L12 13l1.41-1.41-6.8-6.8v.02C4.42 6.45 3 9.05 3 12c0 4.97 4.02 9 9 9z"}) (e "circle" #js {"cx" "12", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "17", "cy" "12", "r" "1"}) (e "circle" #js {"cx" "7", "cy" "12", "r" "1"})]
                                        "AvTimerTwoTone"))
