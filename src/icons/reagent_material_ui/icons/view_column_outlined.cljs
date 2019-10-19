(ns reagent-material-ui.icons.view-column-outlined
  "Imports @material-ui/icons/ViewColumnOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-column-outlined (create-svg-icon (e "path" #js {"d" "M4 5v13h17V5H4zm10 2v9h-3V7h3zM6 7h3v9H6V7zm13 9h-3V7h3v9z"})
                                           "ViewColumnOutlined"))
