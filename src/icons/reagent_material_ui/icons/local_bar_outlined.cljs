(ns reagent-material-ui.icons.local-bar-outlined
  "Imports @material-ui/icons/LocalBarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-bar-outlined (create-svg-icon (e "path" #js {"d" "M14.77 9L12 12.11 9.23 9h5.54M21 3H3v2l8 9v5H6v2h12v-2h-5v-5l8-9V3zM7.43 7L5.66 5h12.69l-1.78 2H7.43z"})
                                         "LocalBarOutlined"))
