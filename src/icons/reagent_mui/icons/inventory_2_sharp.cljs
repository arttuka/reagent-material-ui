(ns reagent-mui.icons.inventory-2-sharp
  "Imports @mui/icons-material/Inventory2Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def inventory-2-sharp (create-svg-icon (e "path" #js {"d" "M2 2v6.7h1V22h18V8.7h1V2H2zm13 12H9v-2h6v2zm5-7H4V4h16v3z"})
                                        "Inventory2Sharp"))
