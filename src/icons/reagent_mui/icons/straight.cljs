(ns reagent-mui.icons.straight
  "Imports @mui/icons-material/Straight as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def straight (create-svg-icon (e "path" #js {"d" "M11 6.83 9.41 8.41 8 7l4-4 4 4-1.41 1.41L13 6.83V21h-2z"})
                               "Straight"))
