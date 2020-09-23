(ns reagent-material-ui.icons.thumb-down-alt-rounded
  "Imports @material-ui/icons/ThumbDownAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def thumb-down-alt-rounded (create-svg-icon (e "path" #js {"d" "M10.88 21.94l5.53-5.54c.37-.37.58-.88.58-1.41V5c0-1.1-.9-2-2-2H6c-.8 0-1.52.48-1.83 1.21L.91 11.82C.06 13.8 1.51 16 3.66 16h5.65l-.95 4.58c-.1.5.05 1.01.41 1.37.59.58 1.53.58 2.11-.01zM21 3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2s2-.9 2-2V5c0-1.1-.9-2-2-2z"})
                                             "ThumbDownAltRounded"))
