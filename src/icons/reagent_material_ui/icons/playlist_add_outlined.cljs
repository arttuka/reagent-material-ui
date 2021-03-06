(ns reagent-material-ui.icons.playlist-add-outlined
  "Imports @material-ui/icons/PlaylistAddOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-add-outlined (create-svg-icon (e "path" #js {"d" "M14 10H3v2h11v-2zm0-4H3v2h11V6zm4 8v-4h-2v4h-4v2h4v4h2v-4h4v-2h-4zM3 16h7v-2H3v2z"})
                                            "PlaylistAddOutlined"))
