(ns reagent-material-ui.icons.trending-down-two-tone
  "Imports @material-ui/icons/TrendingDownTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def trending-down-two-tone (create-svg-icon (e "path" #js {"d" "M16 18l2.29-2.29-4.88-4.88-4 4L2 7.41 3.41 6l6 6 4-4 6.3 6.29L22 12v6h-6z"})
                                             "TrendingDownTwoTone"))
