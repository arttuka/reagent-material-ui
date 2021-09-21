(ns reagent-mui.icons.escalator-sharp
  "Imports @mui/icons-material/EscalatorSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def escalator-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2.5 6h-3.2l-5 9H5.5v-3h3.2l5-9h4.8v3z"})
                                      "EscalatorSharp"))
