(ns reagent-material-ui.icons.send
  "Imports @material-ui/icons/Send as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def send (create-svg-icon (e "path" #js {"d" "M2.01 21 23 12 2.01 3 2 10l15 2-15 2z"})
                           "Send"))
