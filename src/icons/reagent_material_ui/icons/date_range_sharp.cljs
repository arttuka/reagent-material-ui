(ns reagent-material-ui.icons.date-range-sharp
  "Imports @material-ui/icons/DateRangeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def date-range-sharp (create-svg-icon (e "path" #js {"d" "M9 11H7v2h2v-2zm4 0h-2v2h2v-2zm4 0h-2v2h2v-2zm4-7h-3V2h-2v2H8V2H6v2H3v18h18V4zm-2 16H5V9h14v11z"})
                                       "DateRangeSharp"))
