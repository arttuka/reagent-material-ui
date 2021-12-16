(ns reagent-mui.icons.forest-sharp
  "Imports @mui/icons-material/ForestSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def forest-sharp (create-svg-icon [(e "path" #js {"d" "M16 12 9 2 2 12h1.86L0 18h7v4h4v-4h7l-3.86-6z"}) (e "path" #js {"d" "M20.14 12H22L15 2l-2.39 3.41L17.92 13h-1.95l3.22 5H24zM13 19h4v3h-4z"})]
                                   "ForestSharp"))
