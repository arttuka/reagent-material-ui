(ns reagent-mui.icons.play-circle-filled-white
  "Imports @mui/icons-material/PlayCircleFilledWhite as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-circle-filled-white (create-svg-icon (e "path" #js {"transform" "scale(0.5, 0.5)", "d" "M24 4C12.95 4 4 12.95 4 24s8.95 20 20 20 20-8.95 20-20S35.05 4 24 4zm-4 29V15l12 9-12 9z"})
                                               "PlayCircleFilledWhite"))
