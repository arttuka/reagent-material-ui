(ns reagent-material-ui.icons.view-list-outlined
  "Imports @material-ui/icons/ViewListOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-list-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0V0z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M3 5v14h17V5H3zm4 2v2H5V7h2zm-2 6v-2h2v2H5zm0 2h2v2H5v-2zm13 2H9v-2h9v2zm0-4H9v-2h9v2zm0-4H9V7h9v2z"}))
                                         "ViewListOutlined"))
