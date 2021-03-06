(ns reagent-material-ui.icons.security-update-sharp
  "Imports @material-ui/icons/SecurityUpdateSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def security-update-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 17H7V6h10v12zm-1-6h-3V8h-2v4H8l4 4 4-4z"})
                                            "SecurityUpdateSharp"))
