(ns reagent-mui.icons.vibration-sharp
  "Imports @mui/icons-material/VibrationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vibration-sharp (create-svg-icon (e "path" #js {"d" "M0 15h2V9H0v6zm3 2h2V7H3v10zm19-8v6h2V9h-2zm-3 8h2V7h-2v10zM18 3H6v18h12V3zm-2 16H8V5h8v14z"})
                                      "VibrationSharp"))
