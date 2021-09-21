(ns reagent-mui.icons.battery-30-sharp
  "Imports @mui/icons-material/Battery30Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-30-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v11h10V4z"}) (e "path" #js {"d" "M7 15v7h10v-7H7z"}))
                                       "Battery30Sharp"))
