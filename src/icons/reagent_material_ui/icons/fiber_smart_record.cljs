(ns reagent-material-ui.icons.fiber-smart-record
  "Imports @material-ui/icons/FiberSmartRecord as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-smart-record (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "8", "cx" "9"}) (e "path" #js {"d" "M17 4.26v2.09c2.33.82 4 3.04 4 5.65s-1.67 4.83-4 5.65v2.09c3.45-.89 6-4.01 6-7.74s-2.55-6.85-6-7.74z"}))
                                         "FiberSmartRecord"))
