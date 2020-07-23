(ns reagent-material-ui.icons.burst-mode-sharp
  "Imports @material-ui/icons/BurstModeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def burst-mode-sharp (create-svg-icon (e "path" #js {"d" "M1 5h2v14H1V5zm4 0h2v14H5V5zm18 0H9v14h14V5zM11 17l2.5-3.15L15.29 16l2.5-3.22L21 17H11z"})
                                       "BurstModeSharp"))
