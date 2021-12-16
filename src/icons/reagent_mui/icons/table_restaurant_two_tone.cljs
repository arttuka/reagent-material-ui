(ns reagent-mui.icons.table-restaurant-two-tone
  "Imports @mui/icons-material/TableRestaurantTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def table-restaurant-two-tone (create-svg-icon [(e "path" #js {"d" "m5.18 6-.85 3h15.34l-.85-3z", "opacity" ".3"}) (e "path" #js {"d" "m21.96 9.73-1.43-5c-.12-.43-.51-.73-.96-.73H4.43c-.45 0-.84.3-.96.73l-1.43 5c-.18.63.3 1.27.96 1.27h2.2L4 20h2l.67-5h10.67l.66 5h2l-1.2-9H21c.66 0 1.14-.64.96-1.27zM6.93 13l.27-2h9.6l.27 2H6.93zm-2.6-4 .86-3h13.63l.86 3H4.33z"})]
                                                "TableRestaurantTwoTone"))
