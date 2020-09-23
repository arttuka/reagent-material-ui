(ns reagent-material-ui.icons.receipt-long-rounded
  "Imports @material-ui/icons/ReceiptLongRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def receipt-long-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14 9h-4c-.55 0-1-.45-1-1s.45-1 1-1h4c.55 0 1 .45 1 1s-.45 1-1 1zM14 12h-4c-.55 0-1-.45-1-1s.45-1 1-1h4c.55 0 1 .45 1 1s-.45 1-1 1z"}) (e "path" #js {"d" "M19.5 3.5L18 2l-1.5 1.5L15 2l-1.5 1.5L12 2l-1.5 1.5L9 2 7.5 3.5 6 2v14H4c-.55 0-1 .45-1 1v2c0 1.66 1.34 3 3 3h12c1.66 0 3-1.34 3-3V2l-1.5 1.5zM15 20H6c-.55 0-1-.45-1-1v-1h10v2zm4-1c0 .55-.45 1-1 1s-1-.45-1-1v-2c0-.55-.45-1-1-1H8V5h11v14z"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "17"}) (e "circle" #js {"cy" "11", "r" "1", "cx" "17"}))
                                           "ReceiptLongRounded"))
