(ns reagent-mui.icons.battery-20-sharp
  "Imports @mui/icons-material/Battery20Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-20-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"d" "M7 17v5h10v-5H7z"}) (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v13h10V4z"}))
                                       "Battery20Sharp"))
