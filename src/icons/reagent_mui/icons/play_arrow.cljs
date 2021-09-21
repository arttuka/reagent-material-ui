(ns reagent-mui.icons.play-arrow
  "Imports @mui/icons-material/PlayArrow as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-arrow (create-svg-icon (e "path" #js {"d" "M8 5v14l11-7z"})
                                 "PlayArrow"))
