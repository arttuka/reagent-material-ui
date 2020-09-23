(ns reagent-material-ui.icons.check-rounded
  "Imports @material-ui/icons/CheckRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def check-rounded (create-svg-icon (e "path" #js {"d" "M9 16.17L5.53 12.7a.9959.9959 0 00-1.41 0c-.39.39-.39 1.02 0 1.41l4.18 4.18c.39.39 1.02.39 1.41 0L20.29 7.71c.39-.39.39-1.02 0-1.41a.9959.9959 0 00-1.41 0L9 16.17z"})
                                    "CheckRounded"))
