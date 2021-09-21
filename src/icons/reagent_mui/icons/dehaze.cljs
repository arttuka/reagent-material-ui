(ns reagent-mui.icons.dehaze
  "Imports @mui/icons-material/Dehaze as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dehaze (create-svg-icon (e "path" #js {"d" "M2 15.5v2h20v-2H2zm0-5v2h20v-2H2zm0-5v2h20v-2H2z"})
                             "Dehaze"))
