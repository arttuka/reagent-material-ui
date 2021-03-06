(ns reagent-material-ui.icons.done-rounded
  "Imports @material-ui/icons/DoneRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def done-rounded (create-svg-icon (e "path" #js {"d" "M18 6.7l-8.48 8.48-3.54-3.54a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.24 4.24c.39.39 1.02.39 1.41 0l9.18-9.18c.39-.39.39-1.03-.01-1.42-.37-.38-1-.38-1.39.01z"})
                                   "DoneRounded"))
