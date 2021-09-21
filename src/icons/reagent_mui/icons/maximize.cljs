(ns reagent-mui.icons.maximize
  "Imports @mui/icons-material/Maximize as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def maximize (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3z"})
                               "Maximize"))
