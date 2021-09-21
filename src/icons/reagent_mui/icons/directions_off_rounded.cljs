(ns reagent-mui.icons.directions-off-rounded
  "Imports @mui/icons-material/DirectionsOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def directions-off-rounded (create-svg-icon (e "path" #js {"d" "m21.71 11.29-9-9a.9959.9959 0 0 0-1.41 0L8.21 5.38 13 10.17V7.5l3.15 3.15c.2.2.2.51 0 .71l-.98.98 3.45 3.45 3.09-3.09c.38-.38.38-1.01 0-1.41zM6.79 6.79 3.51 3.51a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L5.38 8.2l-3.09 3.09c-.39.39-.39 1.02 0 1.41l9 9c.39.39 1.02.39 1.41 0l3.09-3.09 3.28 3.28c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L6.79 6.79zM9.99 14c0 .55-.45 1-1 1s-1-.45-1-1v-3c0-.05.02-.1.03-.15l1.97 1.97V14z"})
                                             "DirectionsOffRounded"))
