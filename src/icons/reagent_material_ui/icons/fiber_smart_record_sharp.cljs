(ns reagent-material-ui.icons.fiber-smart-record-sharp
  "Imports @material-ui/icons/FiberSmartRecordSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fiber-smart-record-sharp (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "12", "r" "8"}) (e "path" #js {"d" "M17 4.26v2.09c2.33.82 4 3.04 4 5.65s-1.67 4.83-4 5.65v2.09c3.45-.89 6-4.01 6-7.74s-2.55-6.85-6-7.74z"})]
                                               "FiberSmartRecordSharp"))
