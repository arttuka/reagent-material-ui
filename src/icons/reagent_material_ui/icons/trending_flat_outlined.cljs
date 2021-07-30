(ns reagent-material-ui.icons.trending-flat-outlined
  "Imports @material-ui/icons/TrendingFlatOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def trending-flat-outlined (create-svg-icon (e "path" #js {"d" "m22 12-4-4v3H3v2h15v3l4-4z"})
                                             "TrendingFlatOutlined"))
