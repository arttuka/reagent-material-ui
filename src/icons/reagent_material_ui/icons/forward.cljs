(ns reagent-material-ui.icons.forward
  "Imports @material-ui/icons/Forward as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def forward (create-svg-icon (e "path" #js {"d" "M12 8V4l8 8-8 8v-4H4V8z"})
                              "Forward"))
