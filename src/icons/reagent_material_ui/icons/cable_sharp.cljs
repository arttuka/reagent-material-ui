(ns reagent-material-ui.icons.cable-sharp
  "Imports @material-ui/icons/CableSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def cable-sharp (create-svg-icon (e "path" #js {"d" "M20 5V3h-4v2h-1v5h2v9h-4V3H5v11H3v5h1v2h4v-2h1v-5H7V5h4v16h8V10h2V5h-1z"})
                                  "CableSharp"))
