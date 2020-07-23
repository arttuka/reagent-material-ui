(ns reagent-material-ui.icons.play-for-work-two-tone
  "Imports @material-ui/icons/PlayForWorkTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-for-work-two-tone (create-svg-icon (e "path" #js {"d" "M11 5v5.59H7.5l4.5 4.5 4.5-4.5H13V5h-2zm-5 9c0 3.31 2.69 6 6 6s6-2.69 6-6h-2c0 2.21-1.79 4-4 4s-4-1.79-4-4H6z"})
                                             "PlayForWorkTwoTone"))
