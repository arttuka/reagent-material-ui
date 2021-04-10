(ns reagent-material-ui.icons.playlist-add-two-tone
  "Imports @material-ui/icons/PlaylistAddTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def playlist-add-two-tone (create-svg-icon (e "path" #js {"d" "M2 14h8v2H2zm0-4h12v2H2zm0-4h12v2H2zm16 4h-2v4h-4v2h4v4h2v-4h4v-2h-4z"})
                                            "PlaylistAddTwoTone"))
