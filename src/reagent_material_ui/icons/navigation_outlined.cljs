(ns reagent-material-ui.icons.navigation-outlined
  "Imports @material-ui/icons/NavigationOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigation-outlined (create-svg-icon (e "path" #js {"d" "M12 7.27l4.28 10.43-3.47-1.53-.81-.36-.81.36-3.47 1.53L12 7.27M12 2L4.5 20.29l.71.71L12 18l6.79 3 .71-.71L12 2z"})
                                          "NavigationOutlined"))
