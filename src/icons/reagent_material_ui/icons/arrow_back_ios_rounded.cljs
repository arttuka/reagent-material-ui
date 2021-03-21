(ns reagent-material-ui.icons.arrow-back-ios-rounded
  "Imports @material-ui/icons/ArrowBackIosRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-back-ios-rounded (create-svg-icon (e "path" #js {"d" "M10.88 2.88c-.48-.48-1.28-.48-1.76 0L.71 11.29c-.39.39-.39 1.02 0 1.41l8.41 8.41c.49.49 1.28.49 1.77 0s.49-1.28 0-1.77L3.54 12l7.35-7.35c.48-.49.48-1.28-.01-1.77z"})
                                             "ArrowBackIosRounded"))
