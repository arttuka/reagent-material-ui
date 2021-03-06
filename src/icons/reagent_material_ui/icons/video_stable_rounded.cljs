(ns reagent-material-ui.icons.video-stable-rounded
  "Imports @material-ui/icons/VideoStableRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-stable-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19.96 4.01h-16c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2v-12c0-1.1-.9-2-2-2zM20 6v12H4V6h16z"}) (e "path" #js {"d" "M18.42 9.01L7.92 6.18c-.53-.14-1.08.17-1.22.7l-1.85 6.87c-.14.53.17 1.08.71 1.23l10.5 2.83c.53.14 1.08-.17 1.23-.71l1.85-6.87c.13-.53-.19-1.08-.72-1.22z"}))
                                           "VideoStableRounded"))
