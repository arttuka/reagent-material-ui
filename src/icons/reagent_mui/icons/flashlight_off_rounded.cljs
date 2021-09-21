(ns reagent-mui.icons.flashlight-off-rounded
  "Imports @mui/icons-material/FlashlightOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flashlight-off-rounded (create-svg-icon (e "path" #js {"d" "M18 5V4c0-1.1-.9-2-2-2H8c-.86 0-1.58.54-1.87 1.3L7.83 5H18zm-2 6 2-3V7H9.83L16 13.17zM2.1 3.51c-.39.39-.39 1.02 0 1.41l5.9 5.9V20c0 1.1.9 2 2 2h4c1.1 0 2-.9 2-2v-1.17l3.07 3.07c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0z"})
                                             "FlashlightOffRounded"))
