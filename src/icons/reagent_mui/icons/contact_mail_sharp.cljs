(ns reagent-mui.icons.contact-mail-sharp
  "Imports @mui/icons-material/ContactMailSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def contact-mail-sharp (create-svg-icon (e "path" #js {"d" "M21 8V7l-3 2-3-2v1l3 2 3-2zm3-5H0v18h23.99L24 3zM8 6c1.66 0 3 1.34 3 3s-1.34 3-3 3-3-1.34-3-3 1.34-3 3-3zm6 12H2v-1c0-2 4-3.1 6-3.1s6 1.1 6 3.1v1zm8-6h-8V6h8v6z"})
                                         "ContactMailSharp"))
