(ns reagent-mui.icons.play-arrow-outlined
  "Imports @mui/icons-material/PlayArrowOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-arrow-outlined (create-svg-icon (e "path" #js {"d" "M10 8.64 15.27 12 10 15.36V8.64M8 5v14l11-7L8 5z"})
                                          "PlayArrowOutlined"))
