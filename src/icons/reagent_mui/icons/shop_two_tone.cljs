(ns reagent-mui.icons.shop-two-tone
  "Imports @mui/icons-material/ShopTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shop-two-tone (create-svg-icon [(e "path" #js {"d" "M4 19h16V8H4v11zM9 9l7.5 4L9 18V9z", "opacity" ".3"}) (e "path" #js {"d" "M16 6V4c0-1.11-.89-2-2-2h-4c-1.11 0-2 .89-2 2v2H2v13c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6h-6zm-6-2h4v2h-4V4zm10 15H4V8h16v11zM9 9v9l7.5-5z"})]
                                    "ShopTwoTone"))
