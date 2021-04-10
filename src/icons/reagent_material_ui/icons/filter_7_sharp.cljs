(ns reagent-material-ui.icons.filter-7-sharp
  "Imports @material-ui/icons/Filter7Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-7-sharp (create-svg-icon (e "path" #js {"d" "M3 5H1v18h18v-2H3V5zm20-4H5v18h18V1zm-2 16H7V3h14v14zm-8-2l4-8V5h-6v2h4l-4 8h2z"})
                                     "Filter7Sharp"))
