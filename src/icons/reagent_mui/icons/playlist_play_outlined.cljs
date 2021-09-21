(ns reagent-mui.icons.playlist-play-outlined
  "Imports @mui/icons-material/PlaylistPlayOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def playlist-play-outlined (create-svg-icon (e "path" #js {"d" "M3 10h11v2H3zm0-4h11v2H3zm0 8h7v2H3zm13-1v8l6-4z"})
                                             "PlaylistPlayOutlined"))
