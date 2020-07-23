(ns reagent-material-ui.icons.mail-outline-sharp
  "Imports @material-ui/icons/MailOutlineSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mail-outline-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2.01L2 20h20V4zm-2 14H4V8l8 5 8-5v10zm-8-7L4 6h16l-8 5z"})
                                         "MailOutlineSharp"))
