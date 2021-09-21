(ns reagent-mui.icons.carpenter-sharp
  "Imports @mui/icons-material/CarpenterSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def carpenter-sharp (create-svg-icon (e "path" #js {"d" "M7 1.5 3.11 5.39l8.13 11.67-1.41 1.41 4.24 4.24 7.07-7.07L7 1.5zm5.66 16.97 4.24-4.24 1.41 1.41-4.24 4.24-1.41-1.41z"})
                                      "CarpenterSharp"))
