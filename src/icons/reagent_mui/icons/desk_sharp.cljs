(ns reagent-mui.icons.desk-sharp
  "Imports @mui/icons-material/DeskSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def desk-sharp (create-svg-icon (e "path" #js {"d" "M2 6v12h2V8h10v10h2v-2h4v2h2V6H2zm18 2v2h-4V8h4zm-4 6v-2h4v2h-4z"})
                                 "DeskSharp"))
