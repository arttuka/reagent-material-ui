(ns reagent-mui.icons.keyboard-capslock-rounded
  "Imports @mui/icons-material/KeyboardCapslockRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-capslock-rounded (create-svg-icon (e "path" #js {"d" "m12 8.41 3.89 3.89c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.71 6.3a.9959.9959 0 0 0-1.41 0l-4.6 4.59c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L12 8.41zM7 18h10c.55 0 1-.45 1-1s-.45-1-1-1H7c-.55 0-1 .45-1 1s.45 1 1 1z"})
                                                "KeyboardCapslockRounded"))
