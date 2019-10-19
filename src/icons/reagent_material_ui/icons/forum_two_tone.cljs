(ns reagent-material-ui.icons.forum-two-tone
  "Imports @material-ui/icons/ForumTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def forum-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M15 11V4H4v8.17L5.17 11H6z", "opacity" ".3"}) (e "path" #js {"d" "M16 13c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v14l4-4h10zm-12-.83V4h11v7H5.17L4 12.17zM22 7c0-.55-.45-1-1-1h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7z"}))
                                     "ForumTwoTone"))
