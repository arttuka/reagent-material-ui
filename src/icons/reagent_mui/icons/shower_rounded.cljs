(ns reagent-mui.icons.shower-rounded
  "Imports @mui/icons-material/ShowerRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shower-rounded (create-svg-icon [(e "circle" #js {"cx" "8", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "16", "cy" "17", "r" "1"}) (e "path" #js {"d" "M13 5.08V4c0-.55-.45-1-1-1s-1 .45-1 1v1.08C7.61 5.57 5 8.47 5 12v1c0 .55.45 1 1 1h12c.55 0 1-.45 1-1v-1c0-3.53-2.61-6.43-6-6.92z"}) (e "circle" #js {"cx" "8", "cy" "20", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "20", "r" "1"}) (e "circle" #js {"cx" "16", "cy" "20", "r" "1"})]
                                     "ShowerRounded"))
