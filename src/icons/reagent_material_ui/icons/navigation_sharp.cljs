(ns reagent-material-ui.icons.navigation-sharp
  "Imports @material-ui/icons/NavigationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigation-sharp (create-svg-icon (e "path" #js {"d" "M12 2L4.5 20.29l.71.71L12 18l6.79 3 .71-.71L12 2z"})
                                       "NavigationSharp"))
