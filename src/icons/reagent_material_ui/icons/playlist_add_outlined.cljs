(ns reagent-material-ui.icons.playlist-add-outlined
  "Imports @material-ui/icons/PlaylistAddOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-add-outlined (create-svg-icon (e "path" #js {"d" "M14 10H2v2h12v-2zm0-4H2v2h12V6zm4 8v-4h-2v4h-4v2h4v4h2v-4h4v-2h-4zM2 16h8v-2H2v2z"})
                                            "PlaylistAddOutlined"))
