(ns reagent-material-ui.icons.shop-2-sharp
  "Imports @material-ui/icons/Shop2Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def shop-2-sharp (create-svg-icon [(e "path" #js {"d" "M3 9H1v13h18v-2H3z"}) (e "path" #js {"d" "M18 5V1h-8v4H5v13h18V5h-5zm-6-2h4v2h-4V3zm0 12V8l5.5 3.5L12 15z"})]
                                   "Shop2Sharp"))
