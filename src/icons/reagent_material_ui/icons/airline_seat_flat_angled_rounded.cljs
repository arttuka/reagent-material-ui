(ns reagent-material-ui.icons.airline-seat-flat-angled-rounded
  "Imports @material-ui/icons/AirlineSeatFlatAngledRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def airline-seat-flat-angled-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19.91 9.23l-7.05-2.57c-.78-.28-1.64.12-1.92.9l-1.88 5.17 12.22 4.45 1.03-2.82c.75-2.07-.32-4.37-2.4-5.13z"}) (e "circle" #js {"cy" "8.55", "r" "3", "cx" "6.33"}) (e "path" #js {"d" "M2.4 13.5l16.91 6.16c.52.19 1.09-.08 1.28-.6.19-.52-.08-1.09-.6-1.28L3.08 11.62c-.52-.19-1.09.08-1.28.6-.19.52.08 1.09.6 1.28z"}))
                                                       "AirlineSeatFlatAngledRounded"))
