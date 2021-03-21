(ns reagent-material-ui.icons.leaderboard
  "Imports @material-ui/icons/Leaderboard as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def leaderboard (create-svg-icon (e "path" #js {"d" "M7.5 21H2V9h5.5v12zm7.25-18h-5.5v18h5.5V3zM22 11h-5.5v10H22V11z"})
                                  "Leaderboard"))
