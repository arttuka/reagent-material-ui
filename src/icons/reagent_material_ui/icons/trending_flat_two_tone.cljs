(ns reagent-material-ui.icons.trending-flat-two-tone
  "Imports @material-ui/icons/TrendingFlatTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def trending-flat-two-tone (create-svg-icon (e "path" #js {"d" "M22 12l-4-4v3H3v2h15v3l4-4z"})
                                             "TrendingFlatTwoTone"))
