(ns reagent-material-ui.icons.keyboard-arrow-up-rounded
  "Imports @material-ui/icons/KeyboardArrowUpRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-arrow-up-rounded (create-svg-icon (e "path" #js {"d" "M8.12 14.71L12 10.83l3.88 3.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 8.71a.9959.9959 0 00-1.41 0L6.7 13.3c-.39.39-.39 1.02 0 1.41.39.38 1.03.39 1.42 0z"})
                                                "KeyboardArrowUpRounded"))
