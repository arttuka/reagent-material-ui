(ns reagent-material-ui.icons.sms-outlined
  "Imports @material-ui/icons/SmsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def sms-outlined (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H5.17L4 17.17V4h16v12zM7 9h2v2H7zm8 0h2v2h-2zm-4 0h2v2h-2z"})
                                   "SmsOutlined"))
