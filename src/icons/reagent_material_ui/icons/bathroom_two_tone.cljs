(ns reagent-material-ui.icons.bathroom-two-tone
  "Imports @material-ui/icons/BathroomTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bathroom-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 20h16V4H4v16zm5-2c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm3 3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm3 3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm-8-4c0-2.76 2.24-5 5-5s5 2.24 5 5v1H7v-1z", "opacity" ".3"}) (e "circle" #js {"cy" "14", "r" "1", "cx" "15"}) (e "circle" #js {"cy" "14", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "15"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 18H4V4h16v16z"}) (e "path" #js {"d" "M17 11c0-2.76-2.24-5-5-5s-5 2.24-5 5v1h10v-1zm-8.46-.5c.24-1.69 1.7-3 3.46-3s3.22 1.31 3.47 3H8.54z"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "9"}) (e "circle" #js {"cy" "14", "r" "1", "cx" "9"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "12"}))
                                        "BathroomTwoTone"))
