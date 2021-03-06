(ns reagent-material-ui.icons.arrow-forward-ios-two-tone
  "Imports @material-ui/icons/ArrowForwardIosTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-forward-ios-two-tone (create-svg-icon (e "path" #js {"d" "M6.23 20.23L8 22l10-10L8 2 6.23 3.77 14.46 12z"})
                                                 "ArrowForwardIosTwoTone"))
