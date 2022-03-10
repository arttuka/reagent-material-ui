(ns reagent-mui.icons.mail-lock-sharp
  "Imports @mui/icons-material/MailLockSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mail-lock-sharp (create-svg-icon [(e "path" #js {"d" "M22 9.97V4H2.01L2 20h14v-5.03c0-2.76 2.24-5 5-5h1zM20 8l-8 5-8-5V6l8 5 8-5v2z"}) (e "path" #js {"d" "M23 15v-.89c0-1-.68-1.92-1.66-2.08-1.26-.21-2.34.76-2.34 1.97v1h-1v5h6v-5h-1zm-1 0h-2v-1c0-.55.45-1 1-1s1 .45 1 1v1z"})]
                                      "MailLockSharp"))
