(ns reagent-mui.icons.add-box-sharp
  "Imports @mui/icons-material/AddBoxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-box-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-4 10h-4v4h-2v-4H7v-2h4V7h2v4h4v2z"})
                                    "AddBoxSharp"))
