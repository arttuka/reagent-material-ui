(ns reagent-material-ui.icons.switch-left
  "Imports @material-ui/icons/SwitchLeft as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def switch-left (create-svg-icon (e "path" #js {"d" "M8.5 8.62v6.76L5.12 12 8.5 8.62M10 5l-7 7 7 7V5zm4 0v14l7-7-7-7z"})
                                  "SwitchLeft"))
