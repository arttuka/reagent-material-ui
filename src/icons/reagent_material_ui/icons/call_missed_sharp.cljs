(ns reagent-material-ui.icons.call-missed-sharp
  "Imports @material-ui/icons/CallMissedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-missed-sharp (create-svg-icon (e "path" #js {"d" "M19.59 7L12 14.59 6.41 9H11V7H3v8h2v-4.59l7 7 9-9L19.59 7z"})
                                        "CallMissedSharp"))
