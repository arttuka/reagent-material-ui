(ns reagent-mui.icons.playlist-add
  "Imports @mui/icons-material/PlaylistAdd as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def playlist-add (create-svg-icon (e "path" #js {"d" "M14 10H3v2h11v-2zm0-4H3v2h11V6zm4 8v-4h-2v4h-4v2h4v4h2v-4h4v-2h-4zM3 16h7v-2H3v2z"})
                                   "PlaylistAdd"))
