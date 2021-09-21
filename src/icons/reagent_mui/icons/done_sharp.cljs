(ns reagent-mui.icons.done-sharp
  "Imports @mui/icons-material/DoneSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def done-sharp (create-svg-icon (e "path" #js {"d" "M9 16.2 4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z"})
                                 "DoneSharp"))
