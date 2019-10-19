(ns reagent-material-ui.icons.museum-outlined
  "Imports @material-ui/icons/MuseumOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def museum-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M22 11V9L12 2 2 9v2h2v9H2v2h20v-2h-2v-9h2zm-4 9H6V9h12v11z"}) (e "path" #js {"d" "M10 14l2 3 2-3v4h2v-7h-2l-2 3-2-3H8v7h2z"}))
                                      "MuseumOutlined"))
