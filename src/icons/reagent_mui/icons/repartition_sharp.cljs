(ns reagent-mui.icons.repartition-sharp
  "Imports @mui/icons-material/RepartitionSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def repartition-sharp (create-svg-icon (e "path" #js {"d" "M3 21h18v-6H3v6zm7.33-2v-2h3.33v2h-3.33zM19 19h-3.33v-2H19v2zM5 17h3.33v2H5v-2zm1-7 1.42-1.42L5.83 7H17c1.1 0 2 .9 2 2s-.9 2-2 2H3v2h14c2.21 0 4-1.79 4-4s-1.79-4-4-4H5.83l1.59-1.59L6 2 2 6l4 4z"})
                                        "RepartitionSharp"))
