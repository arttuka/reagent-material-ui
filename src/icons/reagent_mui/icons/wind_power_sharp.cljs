(ns reagent-mui.icons.wind-power-sharp
  "Imports @mui/icons-material/WindPowerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wind-power-sharp (create-svg-icon [(e "path" #js {"d" "M4 3h6v2H4zM1 7h5v2H1zm2 12h5v2H3zm12.32-6.91 5.42-9.04L17.32 1 12 5.97v4.74c.31-.13.64-.21 1-.21 1.06 0 1.96.66 2.32 1.59zM10.5 13c0-.82.4-1.54 1.01-2H1v4l7 2 3.44-2.06c-.57-.46-.94-1.15-.94-1.94zm9.67 10L23 20.17l-3.54-6.36-3.98-1c0 .06.02.12.02.19 0 1.38-1.12 2.5-2.5 2.5-.36 0-.69-.08-1-.21V21c-1.1 0-2 .9-2 2h6c0-1.1-.9-2-2-2v-4.17L20.17 23z"}) (e "circle" #js {"cx" "13", "cy" "13", "r" "1.5"})]
                                       "WindPowerSharp"))
