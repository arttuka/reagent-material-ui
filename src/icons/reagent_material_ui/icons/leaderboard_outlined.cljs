(ns reagent-material-ui.icons.leaderboard-outlined
  "Imports @material-ui/icons/LeaderboardOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def leaderboard-outlined (create-svg-icon (e "path" #js {"d" "M16 11V3H8v6H2v12h20V11h-6zm-6-6h4v14h-4V5zm-6 6h4v8H4v-8zm16 8h-4v-6h4v6z"})
                                           "LeaderboardOutlined"))
