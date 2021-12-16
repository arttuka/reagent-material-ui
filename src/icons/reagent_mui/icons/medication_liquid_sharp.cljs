(ns reagent-mui.icons.medication-liquid-sharp
  "Imports @mui/icons-material/MedicationLiquidSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def medication-liquid-sharp (create-svg-icon [(e "path" #js {"d" "M3 3h12v2H3zm4.5 14.5h3V15H13v-3h-2.5V9.5h-3V12H5v3h2.5z"}) (e "path" #js {"d" "M14 6H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 13H4V8h10v11zm6-13c-1.68 0-3 1.76-3 4 0 1.77.83 3.22 2 3.76V20c0 .55.45 1 1 1s1-.45 1-1v-6.24c1.17-.54 2-1.99 2-3.76 0-2.24-1.32-4-3-4zm0 6c-.41 0-1-.78-1-2s.59-2 1-2 1 .78 1 2-.59 2-1 2z"})]
                                              "MedicationLiquidSharp"))
