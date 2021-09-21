(ns reagent-mui.icons.free-breakfast-sharp
  "Imports @mui/icons-material/FreeBreakfastSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def free-breakfast-sharp (create-svg-icon (e "path" #js {"d" "M20 3H4v14h14v-7h2c1.11 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 5h-2V5h2v3zM4 19h16v2H4v-2z"})
                                           "FreeBreakfastSharp"))
