(ns reagent-mui.icons.beenhere-sharp
  "Imports @mui/icons-material/BeenhereSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def beenhere-sharp (create-svg-icon (e "path" #js {"d" "M3.01 1 3 17l9 6 8.99-6L21 1H3.01zM10 16l-5-5 1.41-1.42L10 13.17l7.59-7.59L19 7l-9 9z"})
                                     "BeenhereSharp"))
