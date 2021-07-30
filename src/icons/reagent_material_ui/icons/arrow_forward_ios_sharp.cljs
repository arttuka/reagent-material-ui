(ns reagent-material-ui.icons.arrow-forward-ios-sharp
  "Imports @material-ui/icons/ArrowForwardIosSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-forward-ios-sharp (create-svg-icon (e "path" #js {"d" "M6.23 20.23 8 22l10-10L8 2 6.23 3.77 14.46 12z"})
                                              "ArrowForwardIosSharp"))
