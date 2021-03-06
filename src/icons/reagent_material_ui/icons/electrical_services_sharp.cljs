(ns reagent-material-ui.icons.electrical-services-sharp
  "Imports @material-ui/icons/ElectricalServicesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def electrical-services-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 13h3v2h-3zm-6-1v2h-2v4h2v2h5v-8z"}) (e "path" #js {"d" "M5 11h7V4H4v2h6v3H3v8h6v-2H5zm13 6h3v2h-3z"}))
                                                "ElectricalServicesSharp"))
