(ns reagent-mui.icons.playlist-add-check-rounded
  "Imports @mui/icons-material/PlaylistAddCheckRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def playlist-add-check-rounded (create-svg-icon (e "path" #js {"d" "M13 10H3c-.55 0-1 .45-1 1s.45 1 1 1h10c.55 0 1-.45 1-1s-.45-1-1-1zm0-4H3c-.55 0-1 .45-1 1s.45 1 1 1h10c.55 0 1-.45 1-1s-.45-1-1-1zM3 16h6c.55 0 1-.45 1-1s-.45-1-1-1H3c-.55 0-1 .45-1 1s.45 1 1 1zm19.21-3.79.09.09c.39.39.39 1.02 0 1.41l-5.58 5.59c-.39.39-1.02.39-1.41 0l-3.09-3.09a.9959.9959 0 0 1 0-1.41l.09-.09c.39-.39 1.02-.39 1.41 0l2.3 2.3 4.78-4.79c.38-.4 1.02-.4 1.41-.01z"})
                                                 "PlaylistAddCheckRounded"))
