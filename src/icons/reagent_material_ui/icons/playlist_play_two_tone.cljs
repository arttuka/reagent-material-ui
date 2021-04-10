(ns reagent-material-ui.icons.playlist-play-two-tone
  "Imports @material-ui/icons/PlaylistPlayTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def playlist-play-two-tone (create-svg-icon (e "path" #js {"d" "M4 10h12v2H4zm0-4h12v2H4zm0 8h8v2H4zm10 6l5-3-5-3z"})
                                             "PlaylistPlayTwoTone"))
