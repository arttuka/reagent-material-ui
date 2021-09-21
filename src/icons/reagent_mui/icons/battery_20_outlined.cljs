(ns reagent-mui.icons.battery-20-outlined
  "Imports @mui/icons-material/Battery20Outlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-20-outlined (create-svg-icon (e "React.Fragment" nil (e "path" #js {"d" "M7 17v3.67C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V17H7z"}) (e "path" #js {"fillOpacity" ".3", "d" "M17 5.33C17 4.6 16.4 4 15.67 4H14V2h-4v2H8.33C7.6 4 7 4.6 7 5.33V17h10V5.33z"}))
                                          "Battery20Outlined"))
