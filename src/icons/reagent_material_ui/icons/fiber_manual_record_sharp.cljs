(ns reagent-material-ui.icons.fiber-manual-record-sharp
  "Imports @material-ui/icons/FiberManualRecordSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fiber-manual-record-sharp (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "8"})
                                                "FiberManualRecordSharp"))
