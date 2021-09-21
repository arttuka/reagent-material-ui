(ns reagent-mui.icons.mail-outline-sharp
  "Imports @mui/icons-material/MailOutlineSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mail-outline-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2.01L2 20h20V4zm-2 14H4V8l8 5 8-5v10zm-8-7L4 6h16l-8 5z"})
                                         "MailOutlineSharp"))
