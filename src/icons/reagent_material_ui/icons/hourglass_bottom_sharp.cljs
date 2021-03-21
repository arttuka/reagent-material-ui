(ns reagent-material-ui.icons.hourglass-bottom-sharp
  "Imports @material-ui/icons/HourglassBottomSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hourglass-bottom-sharp (create-svg-icon (e "path" #js {"d" "M18 22l-.01-6L14 12l3.99-4.01L18 2H6v6l4 4-4 3.99V22h12zM8 7.5V4h8v3.5l-4 4-4-4z"})
                                             "HourglassBottomSharp"))
