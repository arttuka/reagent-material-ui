(ns reagent-mui.icons.south-west
  "Imports @mui/icons-material/SouthWest as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def south-west (create-svg-icon (e "path" #js {"d" "M15 19v-2H8.41L20 5.41 18.59 4 7 15.59V9H5v10h10z"})
                                 "SouthWest"))
