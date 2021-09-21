(ns reagent-mui.icons.source-sharp
  "Imports @mui/icons-material/SourceSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def source-sharp (create-svg-icon (e "path" #js {"d" "m12 6-2-2H2v16h20V6H12zm2 10H6v-2h8v2zm4-4H6v-2h12v2z"})
                                   "SourceSharp"))
