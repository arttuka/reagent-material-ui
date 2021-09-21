(ns reagent-mui.icons.battery-60-sharp
  "Imports @mui/icons-material/Battery60Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-60-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v7h10V4z"}) (e "path" #js {"d" "M7 11v11h10V11H7z"}))
                                       "Battery60Sharp"))
