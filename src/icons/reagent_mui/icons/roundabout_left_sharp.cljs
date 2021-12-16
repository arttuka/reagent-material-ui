(ns reagent-mui.icons.roundabout-left-sharp
  "Imports @mui/icons-material/RoundaboutLeftSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roundabout-left-sharp (create-svg-icon (e "path" #js {"d" "M16 13c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4v1H5.83l1.59 1.59L6 13 2 9l4-4 1.41 1.41L5.83 8h4.25c.48-2.84 2.94-5 5.92-5 3.31 0 6 2.69 6 6 0 2.97-2.16 5.44-5 5.92V21h-2v-8h1z"})
                                            "RoundaboutLeftSharp"))
