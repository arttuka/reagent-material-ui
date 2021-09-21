(ns reagent-mui.icons.stay-current-portrait-sharp
  "Imports @mui/icons-material/StayCurrentPortraitSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stay-current-portrait-sharp (create-svg-icon (e "path" #js {"d" "M19 1.01 5.01 1v22H19V1.01zM17 19H7V5h10v14z"})
                                                  "StayCurrentPortraitSharp"))
