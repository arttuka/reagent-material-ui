(ns reagent-mui.icons.reply-outlined
  "Imports @mui/icons-material/ReplyOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def reply-outlined (create-svg-icon (e "path" #js {"d" "M10 9V5l-7 7 7 7v-4.1c5 0 8.5 1.6 11 5.1-1-5-4-10-11-11z"})
                                     "ReplyOutlined"))
