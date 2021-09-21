(ns reagent-mui.icons.flashlight-off
  "Imports @mui/icons-material/FlashlightOff as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flashlight-off (create-svg-icon (e "path" #js {"d" "M18 5V2H6v1.17L7.83 5zm-2 6 2-3V7H9.83L16 13.17zM2.81 2.81 1.39 4.22 8 10.83V22h8v-3.17l3.78 3.78 1.41-1.41L2.81 2.81z"})
                                     "FlashlightOff"))
