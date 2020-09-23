(ns reagent-material-ui.icons.view-quilt-two-tone
  "Imports @material-ui/icons/ViewQuiltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-quilt-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16 12.5h3V16h-3zM6 7h3v9H6zm5 5.5h3V16h-3zM11 7h8v3.5h-8z", "opacity" ".3"}) (e "path" #js {"d" "M4 5v13h17V5H4zm5 11H6V7h3v9zm5 0h-3v-3.5h3V16zm5 0h-3v-3.5h3V16zm0-5.5h-8V7h8v3.5z"}))
                                          "ViewQuiltTwoTone"))
