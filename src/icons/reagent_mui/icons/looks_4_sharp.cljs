(ns reagent-mui.icons.looks-4-sharp
  "Imports @mui/icons-material/Looks4Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-4-sharp (create-svg-icon (e "path" #js {"d" "M21.04 3h-18v18h18V3zm-6 14h-2v-4h-4V7h2v4h2V7h2v10z"})
                                    "Looks4Sharp"))
