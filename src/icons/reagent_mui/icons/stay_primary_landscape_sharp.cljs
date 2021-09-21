(ns reagent-mui.icons.stay-primary-landscape-sharp
  "Imports @mui/icons-material/StayPrimaryLandscapeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stay-primary-landscape-sharp (create-svg-icon (e "path" #js {"d" "M1 19h22V5H1v14zM19 7v10H5V7h14z"})
                                                   "StayPrimaryLandscapeSharp"))
