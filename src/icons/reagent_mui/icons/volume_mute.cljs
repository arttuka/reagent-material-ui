(ns reagent-mui.icons.volume-mute
  "Imports @mui/icons-material/VolumeMute as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volume-mute (create-svg-icon (e "path" #js {"d" "M7 9v6h4l5 5V4l-5 5H7z"})
                                  "VolumeMute"))
