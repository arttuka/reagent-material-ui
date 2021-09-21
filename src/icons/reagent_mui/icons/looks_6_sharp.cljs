(ns reagent-mui.icons.looks-6-sharp
  "Imports @mui/icons-material/Looks6Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-6-sharp (create-svg-icon (e "path" #js {"d" "M11 15h2v-2h-2v2zM21 3H3v18h18V3zm-6 6h-4v2h4v6H9V7h6v2z"})
                                    "Looks6Sharp"))
