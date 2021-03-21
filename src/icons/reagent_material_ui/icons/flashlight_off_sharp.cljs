(ns reagent-material-ui.icons.flashlight-off-sharp
  "Imports @material-ui/icons/FlashlightOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flashlight-off-sharp (create-svg-icon (e "path" #js {"d" "M18 5V2H6v1.17L7.83 5zm-2 6l2-3V7H9.83L16 13.17zM2.81 2.81L1.39 4.22 8 10.83V22h8v-3.17l3.78 3.78 1.41-1.41L2.81 2.81z"})
                                           "FlashlightOffSharp"))
