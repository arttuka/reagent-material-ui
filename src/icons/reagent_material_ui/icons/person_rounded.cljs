(ns reagent-material-ui.icons.person-rounded
  "Imports @material-ui/icons/PersonRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def person-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "8", "r" "4", "cx" "12"}) (e "path" #js {"d" "M18.39 14.56C16.71 13.7 14.53 13 12 13s-4.71.7-6.39 1.56C4.61 15.07 4 16.1 4 17.22V20h16v-2.78c0-1.12-.61-2.15-1.61-2.66z"}))
                                     "PersonRounded"))
