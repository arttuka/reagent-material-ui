(ns reagent-mui.icons.shop-2-sharp
  "Imports @mui/icons-material/Shop2Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shop-2-sharp (create-svg-icon [(e "path" #js {"d" "M3 9H1v13h18v-2H3z"}) (e "path" #js {"d" "M18 5V1h-8v4H5v13h18V5h-5zm-6-2h4v2h-4V3zm0 12V8l5.5 3.5L12 15z"})]
                                   "Shop2Sharp"))
