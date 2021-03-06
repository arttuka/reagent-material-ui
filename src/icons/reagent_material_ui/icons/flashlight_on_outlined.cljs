(ns reagent-material-ui.icons.flashlight-on-outlined
  "Imports @material-ui/icons/FlashlightOnOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flashlight-on-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 2H6v6l2 3v11h8V11l2-3V2zm-2 2v1H8V4h8zm-2 6.4V20h-4v-9.61l-2-3V7h8v.39l-2 3.01z"}) (e "circle" #js {"cy" "14", "r" "1.5", "cx" "12"}))
                                             "FlashlightOnOutlined"))
