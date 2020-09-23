(ns reagent-material-ui.icons.call-split-two-tone
  "Imports @material-ui/icons/CallSplitTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-split-two-tone (create-svg-icon (e "path" #js {"d" "M20 4h-6l2.29 2.29-2.88 2.88 1.42 1.42 2.88-2.88L20 10zM4 4v6l2.29-2.29 4.71 4.7V20h2v-8.41l-5.29-5.3L10 4z"})
                                          "CallSplitTwoTone"))
