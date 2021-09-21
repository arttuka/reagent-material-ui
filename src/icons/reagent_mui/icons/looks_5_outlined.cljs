(ns reagent-mui.icons.looks-5-outlined
  "Imports @mui/icons-material/Looks5Outlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-5-outlined (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14zm-4-4v-2c0-1.11-.9-2-2-2h-2V9h4V7H9v6h4v2H9v2h4c1.1 0 2-.89 2-2z"})
                                       "Looks5Outlined"))
