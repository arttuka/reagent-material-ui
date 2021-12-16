(ns reagent-mui.icons.table-restaurant-sharp
  "Imports @mui/icons-material/TableRestaurantSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def table-restaurant-sharp (create-svg-icon (e "path" #js {"d" "m22.33 11-2-7H3.67l-2 7H5.2L4 20h2l.67-5h10.67l.66 5h2l-1.2-9h3.53zm-15.4 2 .27-2h9.6l.27 2H6.93z"})
                                             "TableRestaurantSharp"))
