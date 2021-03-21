(ns reagent-material-ui.icons.pets-rounded
  "Imports @material-ui/icons/PetsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def pets-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "9.5", "r" "2.5", "cx" "4.5"}) (e "circle" #js {"cy" "5.5", "r" "2.5", "cx" "9"}) (e "circle" #js {"cy" "5.5", "r" "2.5", "cx" "15"}) (e "circle" #js {"cy" "9.5", "r" "2.5", "cx" "19.5"}) (e "path" #js {"d" "M17.35 14.86c-.87-1.02-1.61-2.39-2.49-3.41C13.61 9.98 12.73 10 12 10c-.78 0-1.61.01-2.87 1.46-.87 1.02-1.59 2.39-2.47 3.41-1.31 1.31-2.92 2.76-2.62 4.79.29 1.02 1.02 2.03 2.33 2.32.73.15 3.15-.44 5.63-.44 2.77 0 4.89.58 5.63.44 1.31-.29 2.04-1.31 2.33-2.32.31-2.04-1.3-3.49-2.61-4.8z"}))
                                   "PetsRounded"))
