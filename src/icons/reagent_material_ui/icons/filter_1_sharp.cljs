(ns reagent-material-ui.icons.filter-1-sharp
  "Imports @material-ui/icons/Filter1Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-1-sharp (create-svg-icon (e "path" #js {"d" "M3 5H1v18h18v-2H3V5zm11 10h2V5h-4v2h2v8zm9-14H5v18h18V1zm-2 16H7V3h14v14z"})
                                     "Filter1Sharp"))
