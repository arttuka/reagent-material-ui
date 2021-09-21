(ns reagent-mui.icons.home
  "Imports @mui/icons-material/Home as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def home (create-svg-icon (e "path" #js {"d" "M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z"})
                           "Home"))
