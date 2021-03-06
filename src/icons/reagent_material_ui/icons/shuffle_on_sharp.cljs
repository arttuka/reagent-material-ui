(ns reagent-material-ui.icons.shuffle-on-sharp
  "Imports @material-ui/icons/ShuffleOnSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shuffle-on-sharp (create-svg-icon (e "path" #js {"d" "M1 1v22h22V1H1zm4.41 3l5.18 5.17-1.42 1.41L4 5.41 5.41 4zM20 20h-5.5l2.05-2.05-3.13-3.13 1.41-1.41 3.13 3.13L20 14.5V20zm0-10.5l-2.04-2.04L5.41 20 4 18.59 16.54 6.04 14.5 4H20v5.5z"})
                                       "ShuffleOnSharp"))
