(ns reagent-mui.icons.battery-80-sharp
  "Imports @mui/icons-material/Battery80Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-80-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v5h10V4z"}) (e "path" #js {"d" "M7 9v13h10V9H7z"}))
                                       "Battery80Sharp"))
