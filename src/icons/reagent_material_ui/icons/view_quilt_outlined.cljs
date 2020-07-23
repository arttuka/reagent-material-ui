(ns reagent-material-ui.icons.view-quilt-outlined
  "Imports @material-ui/icons/ViewQuiltOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-quilt-outlined (create-svg-icon (e "path" #js {"d" "M4 5v13h17V5H4zm2 11V7h3v9H6zm5 0v-3.5h3V16h-3zm8 0h-3v-3.5h3V16zm-8-5.5V7h8v3.5h-8z"})
                                          "ViewQuiltOutlined"))
