(ns reagent-mui.icons.shower
  "Imports @mui/icons-material/Shower as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shower (create-svg-icon [(e "circle" #js {"cx" "8", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "16", "cy" "17", "r" "1"}) (e "path" #js {"d" "M13 5.08V3h-2v2.08C7.61 5.57 5 8.47 5 12v2h14v-2c0-3.53-2.61-6.43-6-6.92z"}) (e "circle" #js {"cx" "8", "cy" "20", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "20", "r" "1"}) (e "circle" #js {"cx" "16", "cy" "20", "r" "1"})]
                             "Shower"))
