(ns reagent-mui.icons.e-mobiledata-sharp
  "Imports @mui/icons-material/EMobiledataSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def e-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M16 9V7H8v10h8v-2h-6v-2h6v-2h-6V9h6z"})
                                         "EMobiledataSharp"))
