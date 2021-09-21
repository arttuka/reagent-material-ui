(ns reagent-mui.icons.looks-3-sharp
  "Imports @mui/icons-material/Looks3Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-3-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3.01v18H21V3zm-5.99 14H9v-2h4v-2h-2v-2h2V9H9V7h6.01v10z"})
                                    "Looks3Sharp"))
