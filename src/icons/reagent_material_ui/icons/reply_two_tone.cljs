(ns reagent-material-ui.icons.reply-two-tone
  "Imports @material-ui/icons/ReplyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def reply-two-tone (create-svg-icon (e "path" #js {"d" "M10 9V5l-7 7 7 7v-4.1c5 0 8.5 1.6 11 5.1-1-5-4-10-11-11z"})
                                     "ReplyTwoTone"))
