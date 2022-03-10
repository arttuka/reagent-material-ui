(ns reagent-mui.icons.gas-meter-sharp
  "Imports @mui/icons-material/GasMeterSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gas-meter-sharp (create-svg-icon (e "path" #js {"d" "M20 4h-5V2h-2v2h-2V2H9v2H4v18h16V4zm-8 14c-1.38 0-2.5-1.1-2.5-2.46 0-1.09.43-1.39 2.5-3.79 2.05 2.38 2.5 2.7 2.5 3.79C14.5 16.9 13.38 18 12 18zm4-8H8V8h8v2z"})
                                      "GasMeterSharp"))
