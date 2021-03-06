(ns reagent-material-ui.icons.vertical-align-top-rounded
  "Imports @material-ui/icons/VerticalAlignTopRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-align-top-rounded (create-svg-icon (e "path" #js {"d" "M15.15 10.15l-2.79-2.79c-.2-.2-.51-.2-.71 0l-2.79 2.79c-.32.31-.1.85.35.85H11v9c0 .55.45 1 1 1s1-.45 1-1v-9h1.79c.45 0 .67-.54.36-.85zM5 5h14c.55 0 1-.45 1-1s-.45-1-1-1H5c-.55 0-1 .45-1 1s.45 1 1 1z"})
                                                 "VerticalAlignTopRounded"))
