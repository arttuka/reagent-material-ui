(ns reagent-mui.icons.battery-90-sharp
  "Imports @mui/icons-material/Battery90Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-90-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v4h10V4z"}) (e "path" #js {"d" "M7 8v14h10V8H7z"}))
                                       "Battery90Sharp"))
