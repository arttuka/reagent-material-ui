(ns reagent-material-ui.icons.sports-cricket-rounded
  "Imports @material-ui/icons/SportsCricketRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sports-cricket-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.02 12.78L6.53 4.29a.9959.9959 0 0 0-1.41 0L2.29 7.12c-.39.39-.39 1.02 0 1.41l8.49 8.49c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41zm-.68 4.98l3.54 3.54c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-3.54-3.54-1.41 1.41z"}) (e "circle" #js {"cy" "5.5", "r" "3.5", "cx" "18.5"}))
                                             "SportsCricketRounded"))
