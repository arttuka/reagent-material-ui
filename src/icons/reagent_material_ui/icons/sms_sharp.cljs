(ns reagent-material-ui.icons.sms-sharp
  "Imports @material-ui/icons/SmsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sms-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zM9 11H7V9h2v2zm4 0h-2V9h2v2zm4 0h-2V9h2v2z"})
                                "SmsSharp"))
