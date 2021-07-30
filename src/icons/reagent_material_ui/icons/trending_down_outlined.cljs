(ns reagent-material-ui.icons.trending-down-outlined
  "Imports @material-ui/icons/TrendingDownOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def trending-down-outlined (create-svg-icon (e "path" #js {"d" "m16 18 2.29-2.29-4.88-4.88-4 4L2 7.41 3.41 6l6 6 4-4 6.3 6.29L22 12v6h-6z"})
                                             "TrendingDownOutlined"))
