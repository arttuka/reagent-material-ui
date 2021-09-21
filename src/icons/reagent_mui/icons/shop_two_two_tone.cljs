(ns reagent-mui.icons.shop-two-two-tone
  "Imports @mui/icons-material/ShopTwoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shop-two-two-tone (create-svg-icon [(e "path" #js {"d" "M7 7v9h14V7H7zm5 8V8l5.5 3-5.5 4z", "opacity" ".3"}) (e "path" #js {"d" "M3 9H1v11c0 1.11.89 2 2 2h14c1.11 0 2-.89 2-2H3V9zm15-4V3c0-1.11-.89-2-2-2h-4c-1.11 0-2 .89-2 2v2H5v11c0 1.11.89 2 2 2h14c1.11 0 2-.89 2-2V5h-5zm-6-2h4v2h-4V3zm9 13H7V7h14v9zm-9-1 5.5-4L12 8z"})]
                                        "ShopTwoTwoTone"))
