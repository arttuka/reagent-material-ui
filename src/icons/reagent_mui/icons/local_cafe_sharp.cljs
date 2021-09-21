(ns reagent-mui.icons.local-cafe-sharp
  "Imports @mui/icons-material/LocalCafeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-cafe-sharp (create-svg-icon (e "path" #js {"d" "M20 3H4v14h14v-7h2c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 5h-2V5h2v3zM2 21h18v-2H2v2z"})
                                       "LocalCafeSharp"))
