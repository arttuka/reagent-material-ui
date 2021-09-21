(ns reagent-mui.icons.poll-sharp
  "Imports @mui/icons-material/PollSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def poll-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm6 14H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4z"})
                                 "PollSharp"))
