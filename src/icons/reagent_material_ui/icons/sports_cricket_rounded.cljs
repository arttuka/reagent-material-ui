(ns reagent-material-ui.icons.sports-cricket-rounded
  "Imports @material-ui/icons/SportsCricketRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sports-cricket-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.05 12.81L6.56 4.32a.9959.9959 0 00-1.41 0L2.32 7.15c-.39.39-.39 1.02 0 1.41l8.49 8.49c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41zM14.34 17.76l3.53 3.53c.39.39 1.03.39 1.42 0 .39-.39.39-1.03 0-1.42l-3.53-3.53-1.42 1.42z"}) (e "circle" #js {"cy" "5.5", "r" "3.5", "cx" "18.5"}))
                                             "SportsCricketRounded"))
