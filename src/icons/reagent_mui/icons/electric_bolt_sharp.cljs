(ns reagent-mui.icons.electric-bolt-sharp
  "Imports @mui/icons-material/ElectricBoltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def electric-bolt-sharp (create-svg-icon (e "path" #js {"d" "M15 2 2.5 13 13 14l-5 7 1 1 12.5-11L11 10l5-7z"})
                                          "ElectricBoltSharp"))
