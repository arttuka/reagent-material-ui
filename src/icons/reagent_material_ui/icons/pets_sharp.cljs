(ns reagent-material-ui.icons.pets-sharp
  "Imports @material-ui/icons/PetsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def pets-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "9.5", "r" "2.5", "cx" "4.5"}) (e "circle" #js {"cy" "5.5", "r" "2.5", "cx" "9"}) (e "circle" #js {"cy" "5.5", "r" "2.5", "cx" "15"}) (e "circle" #js {"cy" "9.5", "r" "2.5", "cx" "19.5"}) (e "path" #js {"d" "M17.34 14.86c-.87-1.02-1.6-1.89-2.48-2.91-.46-.54-1.05-1.08-1.75-1.32-.11-.04-.22-.07-.33-.09-.25-.04-.52-.04-.78-.04s-.53 0-.79.05c-.11.02-.22.05-.33.09-.7.24-1.28.78-1.75 1.32-.87 1.02-1.6 1.89-2.48 2.91-1.31 1.31-2.92 2.76-2.62 4.79.29 1.02 1.02 2.03 2.33 2.32.73.15 3.06-.44 5.54-.44h.18c2.48 0 4.81.58 5.54.44 1.31-.29 2.04-1.31 2.33-2.32.31-2.04-1.3-3.49-2.61-4.8z"}))
                                 "PetsSharp"))
