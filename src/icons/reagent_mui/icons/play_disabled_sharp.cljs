(ns reagent-mui.icons.play-disabled-sharp
  "Imports @mui/icons-material/PlayDisabledSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-disabled-sharp (create-svg-icon (e "path" #js {"d" "M16.45 13.62 19 12 8 5v.17zM2.81 2.81 1.39 4.22 8 10.83V19l4.99-3.18 6.79 6.79 1.41-1.42z"})
                                          "PlayDisabledSharp"))
