(ns reagent-material-ui.icons.fiber-manual-record-sharp
  "Imports @material-ui/icons/FiberManualRecordSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-manual-record-sharp (create-svg-icon (e "circle" #js {"cy" "12", "r" "8", "cx" "12"})
                                                "FiberManualRecordSharp"))
