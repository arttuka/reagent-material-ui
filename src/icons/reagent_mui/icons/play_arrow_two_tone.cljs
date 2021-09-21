(ns reagent-mui.icons.play-arrow-two-tone
  "Imports @mui/icons-material/PlayArrowTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-arrow-two-tone (create-svg-icon [(e "path" #js {"d" "M10 8.64v6.72L15.27 12z", "opacity" ".3"}) (e "path" #js {"d" "m8 19 11-7L8 5v14zm2-10.36L15.27 12 10 15.36V8.64z"})]
                                          "PlayArrowTwoTone"))
