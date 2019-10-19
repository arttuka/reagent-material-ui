(ns reagent-material-ui.icons.repeat
  "Imports @material-ui/icons/Repeat as a Reagent component."
  (:refer-clojure :exclude [repeat])
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def repeat (create-svg-icon (e "path" #js {"d" "M7 7h10v3l4-4-4-4v3H5v6h2V7zm10 10H7v-3l-4 4 4 4v-3h12v-6h-2v4z"})
                             "Repeat"))
