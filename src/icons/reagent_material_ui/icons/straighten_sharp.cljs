(ns reagent-material-ui.icons.straighten-sharp
  "Imports @material-ui/icons/StraightenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def straighten-sharp (create-svg-icon (e "path" #js {"d" "M23 6H1v12h22V6zm-2 10H3V8h2v4h2V8h2v4h2V8h2v4h2V8h2v4h2V8h2v8z"})
                                       "StraightenSharp"))
