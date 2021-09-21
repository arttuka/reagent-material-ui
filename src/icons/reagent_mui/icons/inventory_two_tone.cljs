(ns reagent-mui.icons.inventory-two-tone
  "Imports @mui/icons-material/InventoryTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def inventory-two-tone (create-svg-icon [(e "path" #js {"d" "m21 11.5 1.5 1.5-6.99 7L11 15.5l1.5-1.5 3.01 3L21 11.5z"}) (e "path" #js {"d" "M17 5v3H7V5H5v14h6.68l-3.51-3.5 4.33-4.33 3.01 3 3.49-3.5V5z", "opacity" ".3"}) (e "path" #js {"d" "M5 19V5h2v3h10V5h2v5.67l2-2V5c0-1.1-.9-2-2-2h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8.68l-2-2H5zm7-16c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z"})]
                                         "InventoryTwoTone"))
