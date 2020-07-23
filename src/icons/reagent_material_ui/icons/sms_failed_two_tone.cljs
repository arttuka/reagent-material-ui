(ns reagent-material-ui.icons.sms-failed-two-tone
  "Imports @material-ui/icons/SmsFailedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sms-failed-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 17.17L5.17 16H20V4H4v13.17zM11 6h2v4h-2V6zm0 6h2v2h-2v-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H5.17L4 17.17V4h16v12zm-9-4h2v2h-2zm0-6h2v4h-2z"}))
                                          "SmsFailedTwoTone"))
