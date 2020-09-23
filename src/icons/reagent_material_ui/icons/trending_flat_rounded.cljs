(ns reagent-material-ui.icons.trending-flat-rounded
  "Imports @material-ui/icons/TrendingFlatRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def trending-flat-rounded (create-svg-icon (e "path" #js {"d" "M21.65 11.65l-2.79-2.79c-.32-.32-.86-.1-.86.35V11H4c-.55 0-1 .45-1 1s.45 1 1 1h14v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.19.2-.51.01-.7z"})
                                            "TrendingFlatRounded"))
