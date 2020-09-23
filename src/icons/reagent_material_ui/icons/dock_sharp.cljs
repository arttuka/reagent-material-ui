(ns reagent-material-ui.icons.dock-sharp
  "Imports @material-ui/icons/DockSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dock-sharp (create-svg-icon (e "path" #js {"d" "M8 23h8v-2H8v2zM18 1.01L6 1v18h12V1.01zM16 15H8V5h8v10z"})
                                 "DockSharp"))
