(ns reagent-material-ui.icons.three-g-mobiledata-sharp
  "Imports @material-ui/icons/ThreeGMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def three-g-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M3 7v2h5v2H4v2h4v2H3v2h7V7H3zm18 4v6h-9V7h9v2h-7v6h5v-2h-2.5v-2H21z"})
                                               "ThreeGMobiledataSharp"))
