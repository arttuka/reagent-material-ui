(ns reagent-material-ui.icons.play-arrow
  "Imports @material-ui/icons/PlayArrow as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def play-arrow (create-svg-icon (e "path" #js {"d" "M8 5v14l11-7z"})
                                 "PlayArrow"))
