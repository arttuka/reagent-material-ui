(ns reagent-mui.icons.emoji-people-outlined
  "Imports @mui/icons-material/EmojiPeopleOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def emoji-people-outlined (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "4", "r" "2"}) (e "path" #js {"d" "M15.89 8.11C15.5 7.72 14.83 7 13.53 7h-2.54C8.24 6.99 6 4.75 6 2H4c0 3.16 2.11 5.84 5 6.71V22h2v-6h2v6h2V10.05L18.95 14l1.41-1.41-4.47-4.48z"})]
                                            "EmojiPeopleOutlined"))
