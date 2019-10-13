(ns reagent-material-ui.icons.remove-outlined
  "Imports @material-ui/icons/RemoveOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def remove-outlined (create-svg-icon (e "path" #js {"d" "M19 13H5v-2h14v2z"})
                                      "RemoveOutlined"))
