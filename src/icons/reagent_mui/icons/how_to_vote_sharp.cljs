(ns reagent-mui.icons.how-to-vote-sharp
  "Imports @mui/icons-material/HowToVoteSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def how-to-vote-sharp (create-svg-icon (e "path" #js {"d" "M18 13h-.68l-2 2h1.91L19 17H5l1.78-2h2.05l-2-2H6l-3 3v6h18v-6zm1.81-5.04L13.45 1.6 5.68 9.36l6.36 6.36 7.77-7.76zm-6.35-3.55L17 7.95l-4.95 4.95-3.54-3.54 4.95-4.95z"})
                                        "HowToVoteSharp"))
