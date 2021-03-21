(ns reagent-material-ui.icons.hourglass-top-sharp
  "Imports @material-ui/icons/HourglassTopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hourglass-top-sharp (create-svg-icon (e "path" #js {"d" "M6 2l.01 6L10 12l-3.99 4.01L6 22h12v-6l-4-4 4-3.99V2H6zm10 14.5V20H8v-3.5l4-4 4 4z"})
                                          "HourglassTopSharp"))
