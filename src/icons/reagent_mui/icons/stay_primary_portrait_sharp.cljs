(ns reagent-mui.icons.stay-primary-portrait-sharp
  "Imports @mui/icons-material/StayPrimaryPortraitSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stay-primary-portrait-sharp (create-svg-icon (e "path" #js {"d" "M5.01 1v22H19V1H5.01zM17 19H7V5h10v14z"})
                                                  "StayPrimaryPortraitSharp"))
