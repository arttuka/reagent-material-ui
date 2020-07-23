(ns reagent-material-ui.icons.phone-enabled-sharp
  "Imports @material-ui/icons/PhoneEnabledSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def phone-enabled-sharp (create-svg-icon (e "path" #js {"d" "M3 15.46l5.27-.61 2.52 2.52c2.83-1.44 5.15-3.75 6.59-6.59l-2.53-2.53.61-5.25h5.51C21.55 13.18 13.18 21.55 3 20.97v-5.51z"})
                                          "PhoneEnabledSharp"))
