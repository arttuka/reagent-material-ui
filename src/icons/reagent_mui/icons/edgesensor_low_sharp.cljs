(ns reagent-mui.icons.edgesensor-low-sharp
  "Imports @mui/icons-material/EdgesensorLowSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edgesensor-low-sharp (create-svg-icon (e "path" #js {"d" "M2 7h2v7H2V7zm18 3h2v7h-2v-7zM6 2v20h12V2H6zm10 15H8V7h8v10z"})
                                           "EdgesensorLowSharp"))
