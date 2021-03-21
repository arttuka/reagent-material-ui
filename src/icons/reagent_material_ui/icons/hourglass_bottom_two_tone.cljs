(ns reagent-material-ui.icons.hourglass-bottom-two-tone
  "Imports @material-ui/icons/HourglassBottomTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hourglass-bottom-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16 16.5l-4-4-4 4V20h8z", "opacity" ".3"}) (e "path" #js {"d" "M16 16.5l-4-4-4 4V20h8z", "opacity" ".3"}) (e "path" #js {"d" "M6 22h12v-6l-4-4 3.99-4.01L18 2H6l.01 5.99L10 12l-4 3.99V22zM8 7.5V4h8v3.5l-4 4-4-4zm0 9l4-4 4 4V20H8v-3.5z"}))
                                                "HourglassBottomTwoTone"))
