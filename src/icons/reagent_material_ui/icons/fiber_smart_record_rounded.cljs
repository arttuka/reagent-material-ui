(ns reagent-material-ui.icons.fiber-smart-record-rounded
  "Imports @material-ui/icons/FiberSmartRecordRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-smart-record-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "7", "cx" "9"}) (e "path" #js {"d" "M16 6.35c0 .42.26.79.66.93C18.6 7.97 20 9.82 20 12s-1.4 4.03-3.34 4.72c-.4.14-.66.51-.66.93 0 .7.7 1.17 1.36.93C20.06 17.62 22 15.04 22 12s-1.94-5.62-4.64-6.58c-.66-.24-1.36.23-1.36.93z"}))
                                                 "FiberSmartRecordRounded"))
