(ns reagent-mui.icons.cast-sharp
  "Imports @mui/icons-material/CastSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cast-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v5h2V5h18v14h-7v2h9V3zM1 18v3h3c0-1.66-1.34-3-3-3zm0-4v2c2.76 0 5 2.24 5 5h2c0-3.87-3.13-7-7-7zm0-4v2c4.97 0 9 4.03 9 9h2c0-6.08-4.93-11-11-11z"})
                                 "CastSharp"))
