(ns reagent-material-ui.icons.border-all-two-tone
  "Imports @material-ui/icons/BorderAllTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-all-two-tone (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM11 19H5v-6h6v6zm0-8H5V5h6v6zm8 8h-6v-6h6v6zm0-8h-6V5h6v6z"})
                                          "BorderAllTwoTone"))
