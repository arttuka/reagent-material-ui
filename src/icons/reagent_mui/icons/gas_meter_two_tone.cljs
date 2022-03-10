(ns reagent-mui.icons.gas-meter-two-tone
  "Imports @mui/icons-material/GasMeterTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gas-meter-two-tone (create-svg-icon [(e "path" #js {"d" "M16 6H8c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm-4 12c-1.38 0-2.5-1.1-2.5-2.46 0-1.09.43-1.39 2.5-3.79 2.05 2.38 2.5 2.7 2.5 3.79C14.5 16.9 13.38 18 12 18zm4-8H8V8h8v2z", "opacity" ".3"}) (e "path" #js {"d" "M16 4h-1V2h-2v2h-2V2H9v2H8C5.79 4 4 5.79 4 8v10c0 2.21 1.79 4 4 4h8c2.21 0 4-1.79 4-4V8c0-2.21-1.79-4-4-4zm2 14c0 1.1-.9 2-2 2H8c-1.1 0-2-.9-2-2V8c0-1.1.9-2 2-2h8c1.1 0 2 .9 2 2v10z"}) (e "path" #js {"d" "M9.5 15.54C9.5 16.9 10.62 18 12 18s2.5-1.1 2.5-2.46c0-1.09-.45-1.41-2.5-3.79-2.07 2.4-2.5 2.71-2.5 3.79zM8 8h8v2H8z"})]
                                         "GasMeterTwoTone"))
