(ns reagent-material-ui.icons.hourglass-top-two-tone
  "Imports @material-ui/icons/HourglassTopTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def hourglass-top-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 7.5l4 4 4-4V4H8z", "opacity" ".3"}) (e "path" #js {"d" "M8 7.5l4 4 4-4V4H8z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6v6l4 4-3.99 4.01L6 22h12l-.01-5.99L14 12l4-3.99V2zm-2 14.5V20H8v-3.5l4-4 4 4zm0-9l-4 4-4-4V4h8v3.5z"}))
                                             "HourglassTopTwoTone"))
