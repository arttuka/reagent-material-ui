(ns reagent-material-ui.icons.blur-linear-two-tone
  "Imports @material-ui/icons/BlurLinearTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def blur-linear-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 16.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cy" "12", "r" "1", "cx" "9"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "13"}) (e "circle" #js {"cy" "16", "r" "1", "cx" "13"}) (e "path" #js {"d" "M17 12.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cy" "12", "r" "1", "cx" "13"}) (e "path" #js {"d" "M3 3h18v2H3z"}) (e "circle" #js {"cy" "8", "r" "1.5", "cx" "5"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "5"}) (e "circle" #js {"cy" "16", "r" "1.5", "cx" "5"}) (e "path" #js {"d" "M17 8.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cy" "16", "r" "1", "cx" "9"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "9"}) (e "path" #js {"d" "M3 19h18v2H3z"}))
                                           "BlurLinearTwoTone"))
