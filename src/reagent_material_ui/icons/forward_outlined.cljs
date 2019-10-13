(ns reagent-material-ui.icons.forward-outlined
  "Imports @material-ui/icons/ForwardOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def forward-outlined (create-svg-icon (e "path" #js {"d" "M14 8.83L17.17 12 14 15.17V14H6v-4h8V8.83M12 4v4H4v8h8v4l8-8-8-8z"})
                                       "ForwardOutlined"))
