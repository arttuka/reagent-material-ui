(ns reagent-material-ui.icons.category
  "Imports @material-ui/icons/Category as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def category (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 2l-5.5 9h11z"}) (e "circle" #js {"cy" "17.5", "r" "4.5", "cx" "17.5"}) (e "path" #js {"d" "M3 13.5h8v8H3z"}))
                               "Category"))
