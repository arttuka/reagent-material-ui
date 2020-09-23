(ns reagent-material-ui.icons.filter-4-sharp
  "Imports @material-ui/icons/Filter4Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-4-sharp (create-svg-icon (e "path" #js {"d" "M3 5H1v18h18v-2H3V5zm12 10h2V5h-2v4h-2V5h-2v6h4v4zm8-14H5v18h18V1zm-2 16H7V3h14v14z"})
                                     "Filter4Sharp"))
