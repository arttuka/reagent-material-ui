(ns reagent-material-ui.icons.flash-on
  "Imports @material-ui/icons/FlashOn as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flash-on (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l4-8z"})
                               "FlashOn"))
