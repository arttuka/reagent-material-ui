(ns reagent-material-ui.icons.send-to-mobile-sharp
  "Imports @material-ui/icons/SendToMobileSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def send-to-mobile-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 18H7V6h10v1h2V1H5v22h14v-6h-2z"}) (e "path" #js {"d" "M22 12l-4-4v3h-5v2h5v3z"}))
                                           "SendToMobileSharp"))
