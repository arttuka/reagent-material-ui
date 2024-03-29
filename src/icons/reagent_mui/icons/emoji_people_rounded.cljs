(ns reagent-mui.icons.emoji-people-rounded
  "Imports @mui/icons-material/EmojiPeopleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def emoji-people-rounded (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "4", "r" "2"}) (e "path" #js {"d" "M15.89 8.11C15.5 7.72 14.83 7 13.53 7h-2.54c-2.46-.01-4.51-1.8-4.92-4.15-.08-.49-.49-.85-.98-.85-.61 0-1.09.54-1 1.14C4.53 5.8 6.47 7.95 9 8.71V21c0 .55.45 1 1 1s1-.45 1-1v-5h2v5c0 .55.45 1 1 1s1-.45 1-1V10.05l3.24 3.24c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-3.76-3.77z"})]
                                           "EmojiPeopleRounded"))
