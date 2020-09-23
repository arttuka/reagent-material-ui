(ns reagent-material-ui.icons.sim-card-sharp
  "Imports @material-ui/icons/SimCardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sim-card-sharp (create-svg-icon (e "path" #js {"d" "M19.99 2H10L4 8v14h16l-.01-20zM9 19H7v-2h2v2zm8 0h-2v-2h2v2zm-8-4H7v-4h2v4zm4 4h-2v-4h2v4zm0-6h-2v-2h2v2zm4 2h-2v-4h2v4z"})
                                     "SimCardSharp"))
