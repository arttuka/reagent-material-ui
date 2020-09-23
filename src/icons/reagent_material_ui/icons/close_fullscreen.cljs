(ns reagent-material-ui.icons.close-fullscreen
  "Imports @material-ui/icons/CloseFullscreen as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def close-fullscreen (create-svg-icon (e "path" #js {"d" "M22 3.41L16.71 8.7 20 12h-8V4l3.29 3.29L20.59 2 22 3.41zM3.41 22l5.29-5.29L12 20v-8H4l3.29 3.29L2 20.59 3.41 22z"})
                                       "CloseFullscreen"))
