(ns reagent-material-ui.icons.turned-in-not-sharp
  "Imports @material-ui/icons/TurnedInNotSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def turned-in-not-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5.01L5 21l7-3 7 3V3zm-2 15l-5-2.18L7 18V5h10v13z"})
                                          "TurnedInNotSharp"))
