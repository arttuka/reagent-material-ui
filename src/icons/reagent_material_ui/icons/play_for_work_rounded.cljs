(ns reagent-material-ui.icons.play-for-work-rounded
  "Imports @material-ui/icons/PlayForWorkRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def play-for-work-rounded (create-svg-icon (e "path" #js {"d" "M16.9 14c-.49 0-.88.35-.98.83C15.53 16.64 13.93 18 12 18s-3.53-1.36-3.91-3.17c-.1-.48-.5-.83-.99-.83-.61 0-1.11.55-.99 1.15C6.65 17.91 9.08 20 12 20s5.35-2.09 5.89-4.85c.12-.6-.38-1.15-.99-1.15zm-2.11-3H13V6c0-.55-.45-1-1-1s-1 .45-1 1v5H9.21c-.45 0-.67.54-.35.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.31-.31.09-.85-.36-.85z"})
                                            "PlayForWorkRounded"))
