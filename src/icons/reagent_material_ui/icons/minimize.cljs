(ns reagent-material-ui.icons.minimize
  "Imports @material-ui/icons/Minimize as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def minimize (create-svg-icon (e "path" #js {"d" "M6 19h12v2H6z"})
                               "Minimize"))
