(ns reagent-mui.icons.leaderboard-two-tone
  "Imports @mui/icons-material/LeaderboardTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def leaderboard-two-tone (create-svg-icon [(e "path" #js {"d" "M10 5h4v14h-4V5zm-6 6h4v8H4v-8zm16 8h-4v-6h4v6z", "opacity" ".3"}) (e "path" #js {"d" "M16 11V3H8v6H2v12h20V11h-6zm-6-6h4v14h-4V5zm-6 6h4v8H4v-8zm16 8h-4v-6h4v6z"})]
                                           "LeaderboardTwoTone"))
