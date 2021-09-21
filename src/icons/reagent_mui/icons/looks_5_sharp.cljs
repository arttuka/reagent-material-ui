(ns reagent-mui.icons.looks-5-sharp
  "Imports @mui/icons-material/Looks5Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-5-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-6 6h-4v2h4v6H9v-2h4v-2H9V7h6v2z"})
                                    "Looks5Sharp"))
