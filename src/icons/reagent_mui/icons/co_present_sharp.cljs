(ns reagent-mui.icons.co-present-sharp
  "Imports @mui/icons-material/CoPresentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def co-present-sharp (create-svg-icon [(e "path" #js {"d" "M23 3H1v10h2V5h18v16h2z"}) (e "circle" #js {"cx" "9", "cy" "10", "r" "4"}) (e "path" #js {"d" "M15.39 16.56C13.71 15.7 11.53 15 9 15s-4.71.7-6.39 1.56C1.61 17.07 1 18.1 1 19.22V22h16v-2.78c0-1.12-.61-2.15-1.61-2.66z"})]
                                       "CoPresentSharp"))
