(ns reagent-material-ui.icons.highlight-off-two-tone
  "Imports @material-ui/icons/HighlightOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def highlight-off-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4c-4.41 0-8 3.59-8 8s3.59 8 8 8 8-3.59 8-8-3.59-8-8-8zm4 10.59L14.59 16 12 13.41 9.41 16 8 14.59 10.59 12 8 9.41 9.41 8 12 10.59 14.59 8 16 9.41 13.41 12 16 14.59z", "opacity" ".3"}) (e "path" #js {"d" "M14.59 8L12 10.59 9.41 8 8 9.41 10.59 12 8 14.59 9.41 16 12 13.41 14.59 16 16 14.59 13.41 12 16 9.41zM12 2C6.47 2 2 6.47 2 12s4.47 10 10 10 10-4.47 10-10S17.53 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z"}))
                                             "HighlightOffTwoTone"))
