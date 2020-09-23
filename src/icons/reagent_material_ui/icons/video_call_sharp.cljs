(ns reagent-material-ui.icons.video-call-sharp
  "Imports @material-ui/icons/VideoCallSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def video-call-sharp (create-svg-icon (e "path" #js {"d" "M17 10.5V6H3v12h14v-4.5l4 4v-11l-4 4zM14 13h-3v3H9v-3H6v-2h3V8h2v3h3v2z"})
                                       "VideoCallSharp"))
