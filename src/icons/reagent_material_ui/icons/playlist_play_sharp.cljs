(ns reagent-material-ui.icons.playlist-play-sharp
  "Imports @material-ui/icons/PlaylistPlaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-play-sharp (create-svg-icon (e "path" #js {"d" "M4 10h12v2H4zm0-4h12v2H4zm0 8h8v2H4zm10 0v6l5-3z"})
                                          "PlaylistPlaySharp"))
