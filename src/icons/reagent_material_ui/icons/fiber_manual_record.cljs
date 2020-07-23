(ns reagent-material-ui.icons.fiber-manual-record
  "Imports @material-ui/icons/FiberManualRecord as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-manual-record (create-svg-icon (e "circle" #js {"cy" "12", "r" "8", "cx" "12"})
                                          "FiberManualRecord"))
