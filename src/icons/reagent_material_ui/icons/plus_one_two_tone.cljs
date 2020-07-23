(ns reagent-material-ui.icons.plus-one-two-tone
  "Imports @material-ui/icons/PlusOneTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def plus-one-two-tone (create-svg-icon (e "path" #js {"d" "M10 8H8v4H4v2h4v4h2v-4h4v-2h-4V8zm4.5-1.92V7.9l2.5-.5V18h2V5l-4.5 1.08z"})
                                        "PlusOneTwoTone"))
