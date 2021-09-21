(ns reagent-mui.icons.looks-two-sharp
  "Imports @mui/icons-material/LooksTwoSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-two-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-6 10h-4v2h4v2H9v-6h4V9H9V7h6v6z"})
                                      "LooksTwoSharp"))
