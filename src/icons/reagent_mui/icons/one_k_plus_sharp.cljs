(ns reagent-mui.icons.one-k-plus-sharp
  "Imports @mui/icons-material/OneKPlusSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def one-k-plus-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM9 15H7.5v-4.5H6V9h3v6zm4.75 0L12 12.75V15h-1.5V9H12v2.25L13.75 9h1.75l-2.25 3 2.25 3h-1.75zM19 12.5h-1.5V14h-1v-1.5H15v-1h1.5V10h1v1.5H19v1z"})
                                       "OneKPlusSharp"))
