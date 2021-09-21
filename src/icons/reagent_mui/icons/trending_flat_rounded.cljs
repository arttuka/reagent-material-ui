(ns reagent-mui.icons.trending-flat-rounded
  "Imports @mui/icons-material/TrendingFlatRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def trending-flat-rounded (create-svg-icon (e "path" #js {"d" "m21.65 11.65-2.79-2.79c-.32-.32-.86-.1-.86.35V11H4c-.55 0-1 .45-1 1s.45 1 1 1h14v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.19.2-.51.01-.7z"})
                                            "TrendingFlatRounded"))
