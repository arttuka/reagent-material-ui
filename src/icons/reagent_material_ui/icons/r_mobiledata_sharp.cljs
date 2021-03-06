(ns reagent-material-ui.icons.r-mobiledata-sharp
  "Imports @material-ui/icons/RMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def r-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M7.8 7.2L9 10H7L5.87 7.33H4V10H2V2h7v5.2H7.8zM7 4H4v1.33h3V4z"})
                                         "RMobiledataSharp"))
