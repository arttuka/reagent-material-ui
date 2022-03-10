(ns reagent-mui.icons.blinds-closed-sharp
  "Imports @mui/icons-material/BlindsClosedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def blinds-closed-sharp (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h11.25c0 .97.78 1.75 1.75 1.75s1.75-.78 1.75-1.75H22v-2h-2zm-2-8h-2V9h2v2zm-4 0H6V9h8v2zm0 2v2H6v-2h8zm2 0h2v2h-2v-2zm2-6h-2V5h2v2zm-4-2v2H6V5h8zM6 19v-2h8v2H6zm10 0v-2h2v2h-2z"})
                                          "BlindsClosedSharp"))
