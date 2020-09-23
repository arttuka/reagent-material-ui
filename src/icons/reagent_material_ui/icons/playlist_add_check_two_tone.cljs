(ns reagent-material-ui.icons.playlist-add-check-two-tone
  "Imports @material-ui/icons/PlaylistAddCheckTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-add-check-two-tone (create-svg-icon (e "path" #js {"d" "M2 6h12v2H2zm0 4h12v2H2zm0 4h8v2H2zm14.01 3L13 14l-1.5 1.5 4.51 4.5L23 13l-1.5-1.5z"})
                                                  "PlaylistAddCheckTwoTone"))
