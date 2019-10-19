(ns reagent-material-ui.icons.music-note-two-tone
  "Imports @material-ui/icons/MusicNoteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def music-note-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "17", "r" "2", "cx" "10.01", "opacity" ".3"}) (e "path" #js {"d" "M12 3l.01 10.55c-.59-.34-1.27-.55-2-.55C7.79 13 6 14.79 6 17s1.79 4 4.01 4S14 19.21 14 17V7h4V3h-6zm-1.99 16c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"}))
                                          "MusicNoteTwoTone"))
