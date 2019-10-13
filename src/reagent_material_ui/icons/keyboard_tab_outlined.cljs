(ns reagent-material-ui.icons.keyboard-tab-outlined
  "Imports @material-ui/icons/KeyboardTabOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-tab-outlined (create-svg-icon (e "path" #js {"d" "M11.59 7.41L15.17 11H1v2h14.17l-3.59 3.59L13 18l6-6-6-6-1.41 1.41zM20 6v12h2V6h-2z"})
                                            "KeyboardTabOutlined"))
