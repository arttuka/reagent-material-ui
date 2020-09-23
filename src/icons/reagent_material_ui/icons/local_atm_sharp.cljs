(ns reagent-material-ui.icons.local-atm-sharp
  "Imports @material-ui/icons/LocalAtmSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-atm-sharp (create-svg-icon (e "path" #js {"d" "M11 17h2v-1h2v-5h-4v-1h4V8h-2V7h-2v1H9v5h4v1H9v2h2v1zM22 4H2.01L2 20h20V4zm-2 14H4V6h16v12z"})
                                      "LocalAtmSharp"))
