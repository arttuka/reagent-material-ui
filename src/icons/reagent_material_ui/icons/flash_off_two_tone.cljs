(ns reagent-material-ui.icons.flash-off-two-tone
  "Imports @material-ui/icons/FlashOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flash-off-two-tone (create-svg-icon (e "path" #js {"d" "M17 10h-3.61l2.28 2.28zm0-8H7v1.61l6.13 6.13zm-13.59.86L2 4.27l5 5V13h3v9l3.58-6.15L17.73 20l1.41-1.41z"})
                                         "FlashOffTwoTone"))
