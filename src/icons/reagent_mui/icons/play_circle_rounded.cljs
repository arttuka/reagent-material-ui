(ns reagent-mui.icons.play-circle-rounded
  "Imports @mui/icons-material/PlayCircleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-circle-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM9.5 14.67V9.33c0-.79.88-1.27 1.54-.84l4.15 2.67c.61.39.61 1.29 0 1.68l-4.15 2.67c-.66.43-1.54-.05-1.54-.84z"})
                                          "PlayCircleRounded"))
