(ns reagent-mui.icons.swap-horiz-sharp
  "Imports @mui/icons-material/SwapHorizSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swap-horiz-sharp (create-svg-icon (e "path" #js {"d" "M6.99 11 3 15l3.99 4v-3H14v-2H6.99v-3zM21 9l-3.99-4v3H10v2h7.01v3L21 9z"})
                                       "SwapHorizSharp"))
