(ns reagent-material-ui.icons.sd-card-alert-sharp
  "Imports @material-ui/icons/SdCardAlertSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sd-card-alert-sharp (create-svg-icon (e "path" #js {"d" "M20 2H10L4 8v14h16V2zm-7 15h-2v-2h2v2zm0-4h-2V8h2v5z"})
                                          "SdCardAlertSharp"))
