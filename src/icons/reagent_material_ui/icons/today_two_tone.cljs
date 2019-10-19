(ns reagent-material-ui.icons.today-two-tone
  "Imports @material-ui/icons/TodayTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def today-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M19 3h-1V1h-2v2H8V1H6v2H5c-1.11 0-1.99.9-1.99 2L3 19c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V9h14v10zm0-12H5V5h14v2zm-7 4H7v5h5v-5z"}) (e "path" #js {"d" "M5 5h14v2H5z", "opacity" ".3"}))
                                     "TodayTwoTone"))
