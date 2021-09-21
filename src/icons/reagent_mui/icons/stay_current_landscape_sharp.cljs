(ns reagent-mui.icons.stay-current-landscape-sharp
  "Imports @mui/icons-material/StayCurrentLandscapeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stay-current-landscape-sharp (create-svg-icon (e "path" #js {"d" "M1 19h22V5H1v14zM19 7v10H5V7h14z"})
                                                   "StayCurrentLandscapeSharp"))
