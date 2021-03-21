(ns reagent-material-ui.icons.av-timer-rounded
  "Imports @material-ui/icons/AvTimerRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def av-timer-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "16", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "11", "r" "1", "cx" "7"}) (e "circle" #js {"cy" "11", "r" "1", "cx" "17"}) (e "path" #js {"d" "M12 2c-.55 0-1 .45-1 1v2c0 .55.45 1 1 1s1-.45 1-1v-.92c3.31.48 5.87 3.25 6 6.66.14 3.85-3.03 7.2-6.88 7.26C8.19 18.06 5 14.91 5 11c0-1.68.59-3.22 1.58-4.42l4.71 4.72c.39.39 1.02.39 1.41 0s.39-1.02 0-1.41L7.26 4.46c-.38-.38-1-.39-1.4-.02C4.1 6.07 3 8.4 3 11c0 5.04 4.14 9.12 9.21 9 4.7-.11 8.63-4.01 8.78-8.71C21.16 6.19 17.07 2 12 2z"}))
                                       "AvTimerRounded"))
