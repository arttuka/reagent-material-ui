(ns reagent-mui.icons.bolt-sharp
  "Imports @mui/icons-material/BoltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bolt-sharp (create-svg-icon (e "path" #js {"d" "M11 21h-1l1-7H6.74S10.42 7.54 13 3h1l-1 7h4.28L11 21z"})
                                 "BoltSharp"))
