(ns reagent-mui.icons.minimize
  "Imports @mui/icons-material/Minimize as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def minimize (create-svg-icon (e "path" #js {"d" "M6 19h12v2H6z"})
                               "Minimize"))
