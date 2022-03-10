(ns reagent-mui.icons.propane-tank-sharp
  "Imports @mui/icons-material/PropaneTankSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def propane-tank-sharp (create-svg-icon (e "path" #js {"d" "M4 15v3c0 2.21 1.79 4 4 4h8c2.21 0 4-1.79 4-4v-3H4zm16-2v-3c0-1.86-1.28-3.41-3-3.86V2H7v4.14c-1.72.45-3 2-3 3.86v3h16zM9 4h6v2h-2V5h-2v1H9V4z"})
                                         "PropaneTankSharp"))
