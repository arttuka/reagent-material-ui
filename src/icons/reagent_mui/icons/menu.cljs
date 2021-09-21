(ns reagent-mui.icons.menu
  "Imports @mui/icons-material/Menu as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def menu (create-svg-icon (e "path" #js {"d" "M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z"})
                           "Menu"))
