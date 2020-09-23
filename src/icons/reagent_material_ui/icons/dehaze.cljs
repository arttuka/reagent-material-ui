(ns reagent-material-ui.icons.dehaze
  "Imports @material-ui/icons/Dehaze as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dehaze (create-svg-icon (e "path" #js {"d" "M2 15.5v2h20v-2H2zm0-5v2h20v-2H2zm0-5v2h20v-2H2z"})
                             "Dehaze"))
