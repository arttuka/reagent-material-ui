(ns reagent-mui.icons.thumb-down-alt-sharp
  "Imports @mui/icons-material/ThumbDownAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def thumb-down-alt-sharp (create-svg-icon (e "path" #js {"d" "M1 11.6V16h8.31l-1.12 5.38L9.83 23 17 15.82V3H4.69zM19 3h4v12h-4z"})
                                           "ThumbDownAltSharp"))
