(ns reagent-material-ui.icons.looks-two-sharp
  "Imports @material-ui/icons/LooksTwoSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-two-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-6 10h-4v2h4v2H9v-6h4V9H9V7h6v6z"})
                                      "LooksTwoSharp"))
