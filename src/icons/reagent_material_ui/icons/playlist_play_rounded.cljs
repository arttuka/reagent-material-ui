(ns reagent-material-ui.icons.playlist-play-rounded
  "Imports @material-ui/icons/PlaylistPlayRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def playlist-play-rounded (create-svg-icon (e "path" #js {"d" "M4 12h9c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0-4h9c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 8h5c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm12-2.07v6.13c0 .4.45.64.78.42l4.6-3.07c.3-.2.3-.63 0-.83l-4.6-3.07c-.33-.21-.78.02-.78.42z"})
                                            "PlaylistPlayRounded"))
