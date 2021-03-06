(ns reagent-material-ui.icons.play-circle-outline-rounded
  "Imports @material-ui/icons/PlayCircleOutlineRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-circle-outline-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm-.96-4.49l4.15-2.67c.61-.39.61-1.29 0-1.68l-4.15-2.67c-.66-.43-1.54.05-1.54.84v5.34c0 .79.88 1.27 1.54.84z"})
                                                  "PlayCircleOutlineRounded"))
