(ns reagent-material-ui.icons.playlist-add-check-rounded
  "Imports @material-ui/icons/PlaylistAddCheckRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def playlist-add-check-rounded (create-svg-icon (e "path" #js {"d" "M13 10H4c-.55 0-1 .45-1 1s.45 1 1 1h9c.55 0 1-.45 1-1s-.45-1-1-1zm0-4H4c-.55 0-1 .45-1 1s.45 1 1 1h9c.55 0 1-.45 1-1s-.45-1-1-1zM4 16h5c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm15.88-3.36l-3.54 3.54-1.41-1.41a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.12 2.12c.39.39 1.02.39 1.41 0l4.24-4.24c.39-.39.39-1.02 0-1.41a.987.987 0 0 0-1.41-.01z"})
                                                 "PlaylistAddCheckRounded"))
