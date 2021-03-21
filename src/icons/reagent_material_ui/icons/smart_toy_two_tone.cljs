(ns reagent-material-ui.icons.smart-toy-two-tone
  "Imports @material-ui/icons/SmartToyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def smart-toy-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 7H6v12h12V7zM7.5 11.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5S9.83 13 9 13s-1.5-.67-1.5-1.5zM16 17H8v-2h8v2zm-1-4c-.83 0-1.5-.67-1.5-1.5S14.17 10 15 10s1.5.67 1.5 1.5S15.83 13 15 13z", "opacity" ".3"}) (e "path" #js {"d" "M8 15h8v2H8z"}) (e "path" #js {"d" "M20 9V7c0-1.1-.9-2-2-2h-3c0-1.66-1.34-3-3-3S9 3.34 9 5H6c-1.1 0-2 .9-2 2v2c-1.66 0-3 1.34-3 3s1.34 3 3 3v4c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-4c1.66 0 3-1.34 3-3s-1.34-3-3-3zm-2 10H6V7h12v12z"}) (e "circle" #js {"cy" "11.5", "r" "1.5", "cx" "15"}) (e "circle" #js {"cy" "11.5", "r" "1.5", "cx" "9"}))
                                         "SmartToyTwoTone"))
