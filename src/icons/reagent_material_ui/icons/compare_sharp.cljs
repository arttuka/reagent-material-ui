(ns reagent-material-ui.icons.compare-sharp
  "Imports @material-ui/icons/CompareSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def compare-sharp (create-svg-icon (e "path" #js {"d" "M10 3H3v18h7v2h2V1h-2v2zm0 15H5l5-6v6zM21 3h-7v2h5v13l-5-6v9h7V3z"})
                                    "CompareSharp"))
