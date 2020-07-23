(ns reagent-material-ui.icons.swap-vert-two-tone
  "Imports @material-ui/icons/SwapVertTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def swap-vert-two-tone (create-svg-icon (e "path" #js {"d" "M16 17.01V10h-2v7.01h-3L15 21l4-3.99h-3zM9 3L5 6.99h3V14h2V6.99h3L9 3z"})
                                         "SwapVertTwoTone"))
