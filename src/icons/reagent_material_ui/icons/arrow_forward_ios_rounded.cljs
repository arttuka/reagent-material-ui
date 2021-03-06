(ns reagent-material-ui.icons.arrow-forward-ios-rounded
  "Imports @material-ui/icons/ArrowForwardIosRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-forward-ios-rounded (create-svg-icon (e "path" #js {"d" "M7.12 21.12c.49.49 1.28.49 1.77 0l8.41-8.41c.39-.39.39-1.02 0-1.41L8.88 2.88c-.48-.48-1.28-.48-1.76 0-.49.49-.49 1.28 0 1.77L14.46 12l-7.35 7.35c-.48.49-.48 1.28.01 1.77z"})
                                                "ArrowForwardIosRounded"))
