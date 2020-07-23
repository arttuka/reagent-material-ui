(ns reagent-material-ui.icons.replay-two-tone
  "Imports @material-ui/icons/ReplayTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def replay-two-tone (create-svg-icon (e "path" #js {"d" "M7 6l5 5V7c3.31 0 6 2.69 6 6s-2.69 6-6 6-6-2.69-6-6H4c0 4.42 3.58 8 8 8s8-3.58 8-8-3.58-8-8-8V1L7 6z"})
                                      "ReplayTwoTone"))
