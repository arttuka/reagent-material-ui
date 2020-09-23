(ns reagent-material-ui.icons.filter-6-sharp
  "Imports @material-ui/icons/Filter6Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-6-sharp (create-svg-icon (e "path" #js {"d" "M3 5H1v18h18v-2H3V5zm20-4H5v18h18V1zm-2 16H7V3h14v14zm-10-2h6V9h-4V7h4V5h-6v10zm2-4h2v2h-2v-2z"})
                                     "Filter6Sharp"))
