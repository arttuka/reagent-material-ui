(ns reagent-material-ui.icons.shortcut
  "Imports @material-ui/icons/Shortcut as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shortcut (create-svg-icon (e "path" #js {"d" "M21 11l-6-6v5H8c-2.76 0-5 2.24-5 5v4h2v-4c0-1.65 1.35-3 3-3h7v5l6-6z"})
                               "Shortcut"))
