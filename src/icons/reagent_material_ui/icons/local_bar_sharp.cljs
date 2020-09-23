(ns reagent-material-ui.icons.local-bar-sharp
  "Imports @material-ui/icons/LocalBarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-bar-sharp (create-svg-icon (e "path" #js {"d" "M21 5V3H3v2l8 9v5H6v2h12v-2h-5v-5l8-9zM7.43 7L5.66 5h12.69l-1.78 2H7.43z"})
                                      "LocalBarSharp"))
