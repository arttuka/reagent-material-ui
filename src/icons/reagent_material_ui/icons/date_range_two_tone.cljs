(ns reagent-material-ui.icons.date-range-two-tone
  "Imports @material-ui/icons/DateRangeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def date-range-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 8h14V6H5z", "opacity" ".3"}) (e "path" #js {"d" "M7 11h2v2H7zm12-7h-1V2h-2v2H8V2H6v2H5c-1.11 0-1.99.9-1.99 2L3 20c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 16H5V10h14v10zm0-12H5V6h14v2zm-4 3h2v2h-2zm-4 0h2v2h-2z"}))
                                          "DateRangeTwoTone"))
