(ns reagent-mui.icons.table-restaurant-rounded
  "Imports @mui/icons-material/TableRestaurantRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def table-restaurant-rounded (create-svg-icon (e "path" #js {"d" "m21.96 9.73-1.43-5c-.12-.43-.51-.73-.96-.73H4.43c-.45 0-.84.3-.96.73l-1.43 5c-.18.63.3 1.27.96 1.27h2.2l-1.05 7.88c-.08.59.38 1.12.98 1.12.5 0 .92-.37.98-.86L6.67 15h10.67l.55 4.14c.07.49.49.86.98.86.6 0 1.06-.53.98-1.12L18.8 11H21c.66 0 1.14-.64.96-1.27zM6.93 13l.27-2h9.6l.27 2H6.93z"})
                                               "TableRestaurantRounded"))
