(ns reagent-material-ui.icons.sim-card-download-sharp
  "Imports @material-ui/icons/SimCardDownloadSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sim-card-download-sharp (create-svg-icon (e "path" #js {"d" "M20 2H10L4 8v14h16V2zm-8 15l-4-4h3V9.02L13 9v4h3l-4 4z"})
                                              "SimCardDownloadSharp"))
