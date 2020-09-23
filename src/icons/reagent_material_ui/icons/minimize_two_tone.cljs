(ns reagent-material-ui.icons.minimize-two-tone
  "Imports @material-ui/icons/MinimizeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def minimize-two-tone (create-svg-icon (e "path" #js {"d" "M6 19h12v2H6v-2z"})
                                        "MinimizeTwoTone"))
