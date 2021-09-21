(ns reagent-mui.icons.cancel-presentation-sharp
  "Imports @mui/icons-material/CancelPresentationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cancel-presentation-sharp (create-svg-icon (e "path" #js {"d" "M1 3v18h22V3H1zm20 16H3V5h18v14zM9.41 16 12 13.41 14.59 16 16 14.59 13.41 12 16 9.41 14.59 8 12 10.59 9.41 8 8 9.41 10.59 12 8 14.59z"})
                                                "CancelPresentationSharp"))
