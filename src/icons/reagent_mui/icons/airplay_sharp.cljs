(ns reagent-mui.icons.airplay-sharp
  "Imports @mui/icons-material/AirplaySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airplay-sharp (create-svg-icon (e "path" #js {"d" "M6 22h12l-6-6-6 6zM23 3H1v16h6v-2H3V5h18v12h-4v2h6V3z"})
                                    "AirplaySharp"))
