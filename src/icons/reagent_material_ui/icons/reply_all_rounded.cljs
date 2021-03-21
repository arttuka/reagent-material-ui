(ns reagent-material-ui.icons.reply-all-rounded
  "Imports @material-ui/icons/ReplyAllRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def reply-all-rounded (create-svg-icon (e "path" #js {"d" "M18 10h-5V7.41c0-.89-1.08-1.34-1.71-.71L7.7 10.29c-.39.39-.39 1.02 0 1.41l3.59 3.59c.63.63 1.71.18 1.71-.71V12h5c1.65 0 3 1.35 3 3v3c0 .55.45 1 1 1s1-.45 1-1v-3c0-2.76-2.24-5-5-5zM8 7.4c0-.89-1.08-1.34-1.71-.71L2.7 10.28c-.39.39-.39 1.02 0 1.41l3.59 3.59c.63.63 1.71.18 1.71-.71 0-.27-.11-.52-.29-.71l-2.88-2.88L7.71 8.1c.18-.18.29-.43.29-.7z"})
                                        "ReplyAllRounded"))
