(ns reagent-material-ui.icons.beenhere-sharp
  "Imports @material-ui/icons/BeenhereSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def beenhere-sharp (create-svg-icon (e "path" #js {"d" "M3.01 1L3 17l9 6 8.99-6L21 1H3.01zM10 16l-5-5 1.41-1.42L10 13.17l7.59-7.59L19 7l-9 9z"})
                                     "BeenhereSharp"))
