(ns reagent-material-ui.icons.inventory-2-sharp
  "Imports @material-ui/icons/Inventory2Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def inventory-2-sharp (create-svg-icon (e "path" #js {"d" "M2 2v6.7h1V22h18V8.7h1V2H2zm13 12H9v-2h6v2zm5-7H4V4h16v3z"})
                                        "Inventory2Sharp"))
