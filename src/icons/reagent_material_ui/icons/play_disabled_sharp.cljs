(ns reagent-material-ui.icons.play-disabled-sharp
  "Imports @material-ui/icons/PlayDisabledSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def play-disabled-sharp (create-svg-icon (e "path" #js {"d" "M16.45 13.62L19 12 8 5v.17zM2.81 2.81L1.39 4.22 8 10.83V19l4.99-3.18 6.79 6.79 1.41-1.42z"})
                                          "PlayDisabledSharp"))
