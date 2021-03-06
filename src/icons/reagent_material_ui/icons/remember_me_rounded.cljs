(ns reagent-material-ui.icons.remember-me-rounded
  "Imports @material-ui/icons/RememberMeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def remember-me-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 14.21c-1.5-.77-3.2-1.21-5-1.21s-3.5.44-5 1.21V6h10v9.21z"}) (e "circle" #js {"cy" "10", "r" "3", "cx" "12"}))
                                          "RememberMeRounded"))
