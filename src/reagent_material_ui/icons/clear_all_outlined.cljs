(ns reagent-material-ui.icons.clear-all-outlined
  "Imports @material-ui/icons/ClearAllOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def clear-all-outlined (create-svg-icon (e "path" #js {"d" "M5 13h14v-2H5v2zm-2 4h14v-2H3v2zM7 7v2h14V7H7z"})
                                         "ClearAllOutlined"))
