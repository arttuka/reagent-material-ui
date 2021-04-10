(ns reagent-material-ui.icons.play-circle-filled-white
  "Imports @material-ui/icons/PlayCircleFilledWhite as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def play-circle-filled-white (create-svg-icon (e "path" #js {"d" "M24 4C12.95 4 4 12.95 4 24s8.95 20 20 20 20-8.95 20-20S35.05 4 24 4zm-4 29V15l12 9-12 9z", "transform" "scale(0.5, 0.5)"})
                                               "PlayCircleFilledWhite"))
