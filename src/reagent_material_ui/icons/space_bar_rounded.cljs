(ns reagent-material-ui.icons.space-bar-rounded
  "Imports @material-ui/icons/SpaceBarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def space-bar-rounded (create-svg-icon (e "path" #js {"d" "M18 10v3H6v-3c0-.55-.45-1-1-1s-1 .45-1 1v4c0 .55.45 1 1 1h14c.55 0 1-.45 1-1v-4c0-.55-.45-1-1-1s-1 .45-1 1z"})
                                        "SpaceBarRounded"))
