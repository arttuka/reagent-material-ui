(ns reagent-material-ui.icons.playlist-add-check-sharp
  "Imports @material-ui/icons/PlaylistAddCheckSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def playlist-add-check-sharp (create-svg-icon (e "path" #js {"d" "M3 10h11v2H3zm0-4h11v2H3zm0 8h7v2H3zm17.59-2.07-4.25 4.24-2.12-2.12-1.41 1.41L16.34 19 22 13.34z"})
                                               "PlaylistAddCheckSharp"))
