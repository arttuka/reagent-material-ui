(ns reagent-material-ui.icons.watch-later-rounded
  "Imports @material-ui/icons/WatchLaterRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def watch-later-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0z", "id" "a"})) (e "path" #js {"d" "M12 2C6.5 2 2 6.5 2 12s4.5 10 10 10 10-4.5 10-10S17.5 2 12 2zm3.55 13.8l-4.08-2.51c-.3-.18-.48-.5-.48-.85V7.75c.01-.41.35-.75.76-.75.41 0 .75.34.75.75v4.45l3.84 2.31c.36.22.48.69.26 1.05-.22.35-.69.46-1.05.24z"}))
                                          "WatchLaterRounded"))
