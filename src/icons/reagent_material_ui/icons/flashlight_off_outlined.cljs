(ns reagent-material-ui.icons.flashlight-off-outlined
  "Imports @material-ui/icons/FlashlightOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flashlight-off-outlined (create-svg-icon (e "path" #js {"d" "M2.81 2.81L1.39 4.22 8 10.83V22h8v-3.17l3.78 3.78 1.41-1.41L2.81 2.81zM14 20h-4v-7.17l4 4V20zm2-16v1H7.83l2 2H16v.39l-2 3.01v.77l2 2V11l2-3V2H6v1.17l.83.83z"})
                                              "FlashlightOffOutlined"))
