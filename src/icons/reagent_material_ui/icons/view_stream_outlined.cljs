(ns reagent-material-ui.icons.view-stream-outlined
  "Imports @material-ui/icons/ViewStreamOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-stream-outlined (create-svg-icon (e "path" #js {"d" "M4 6v12h17V6H4zm15 10H6v-3h13v3zM6 11V8h13v3H6z"})
                                           "ViewStreamOutlined"))
