(ns reagent-material-ui.icons.list
  "Imports @material-ui/icons/List as a Reagent component."
  (:refer-clojure :exclude [list])
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def list (create-svg-icon (e "path" #js {"d" "M3 13h2v-2H3v2zm0 4h2v-2H3v2zm0-8h2V7H3v2zm4 4h14v-2H7v2zm0 4h14v-2H7v2zM7 7v2h14V7H7z"})
                           "List"))
