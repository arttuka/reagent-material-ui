(ns reagent-material-ui.icons.view-column
  "Imports @material-ui/icons/ViewColumn as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-column (create-svg-icon (e "path" #js {"d" "M10 18h5V5h-5v13zm-6 0h5V5H4v13zM16 5v13h5V5h-5z"})
                                  "ViewColumn"))
