(ns reagent-material-ui.icons.tablet-sharp
  "Imports @material-ui/icons/TabletSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def tablet-sharp (create-svg-icon (e "path" #js {"d" "M23 4H1v16h21.99L23 4zm-4 14H5V6h14v12z"})
                                   "TabletSharp"))
