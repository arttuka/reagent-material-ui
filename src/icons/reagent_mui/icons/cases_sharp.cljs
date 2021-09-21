(ns reagent-mui.icons.cases-sharp
  "Imports @mui/icons-material/CasesSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cases-sharp (create-svg-icon (e "path" #js {"d" "M18 5V1h-8v4H5v13h18V5h-5zm-2 0h-4V3h4v2zM3 9H1v13h18v-2H3V9z"})
                                  "CasesSharp"))
