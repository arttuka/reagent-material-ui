(ns reagent-material-ui.icons.lte-mobiledata-sharp
  "Imports @material-ui/icons/LteMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def lte-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M6 14h3v2H4V8h2v6zm3-4h2v6h2v-6h2V8H9v2zm12 0V8h-5v8h5v-2h-3v-1h3v-2h-3v-1h3z"})
                                           "LteMobiledataSharp"))
