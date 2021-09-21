(ns reagent-mui.icons.monitor-weight-rounded
  "Imports @mui/icons-material/MonitorWeightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def monitor-weight-rounded (create-svg-icon [(e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7 9c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"}) (e "circle" #js {"cx" "10.5", "cy" "9", "r" ".5"}) (e "circle" #js {"cx" "13.5", "cy" "9", "r" ".5"}) (e "circle" #js {"cx" "12", "cy" "9", "r" ".5"})]
                                             "MonitorWeightRounded"))
