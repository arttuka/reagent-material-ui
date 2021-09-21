(ns reagent-mui.icons.iron-sharp
  "Imports @mui/icons-material/IronSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def iron-sharp (create-svg-icon (e "path" #js {"d" "M18 6v8h-1V7H7v3h2V9h6v2H6c-2.21 0-4 1.79-4 4v3h15v-2h3V8h2V6h-4z"})
                                 "IronSharp"))
