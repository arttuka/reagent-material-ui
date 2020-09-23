(ns reagent-material-ui.icons.arrow-downward-rounded
  "Imports @material-ui/icons/ArrowDownwardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-downward-rounded (create-svg-icon (e "path" #js {"d" "M11 5v11.17l-4.88-4.88c-.39-.39-1.03-.39-1.42 0-.39.39-.39 1.02 0 1.41l6.59 6.59c.39.39 1.02.39 1.41 0l6.59-6.59c.39-.39.39-1.02 0-1.41a.9959.9959 0 00-1.41 0L13 16.17V5c0-.55-.45-1-1-1s-1 .45-1 1z"})
                                             "ArrowDownwardRounded"))
