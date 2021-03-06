(ns reagent-material-ui.icons.flashlight-on-two-tone
  "Imports @material-ui/icons/FlashlightOnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flashlight-on-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 7.39l2 3V20h4v-9.6l2-3.01V7H8v.39zm4 5.11c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zM8 4h8v1H8z", "opacity" ".3"}) (e "path" #js {"d" "M6 2v6l2 3v11h8V11l2-3V2H6zm10 5.39l-2 3.01V20h-4v-9.61l-2-3V7h8v.39zM16 5H8V4h8v1z"}) (e "circle" #js {"cy" "14", "r" "1.5", "cx" "12"}))
                                             "FlashlightOnTwoTone"))
