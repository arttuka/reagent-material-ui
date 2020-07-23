(ns reagent-material-ui.icons.pause-two-tone
  "Imports @material-ui/icons/PauseTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def pause-two-tone (create-svg-icon (e "path" #js {"d" "M6 5h4v14H6zm8 0h4v14h-4z"})
                                     "PauseTwoTone"))
