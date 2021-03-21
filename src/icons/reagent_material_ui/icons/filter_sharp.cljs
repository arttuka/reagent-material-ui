(ns reagent-material-ui.icons.filter-sharp
  "Imports @material-ui/icons/FilterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-sharp (create-svg-icon (e "path" #js {"d" "M15.96 10.29l-2.75 3.54-1.96-2.36L8.5 15h11l-3.54-4.71zM3 5H1v18h18v-2H3V5zm20-4H5v18h18V1zm-2 16H7V3h14v14z"})
                                   "FilterSharp"))
