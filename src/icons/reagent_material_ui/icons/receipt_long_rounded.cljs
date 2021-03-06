(ns reagent-material-ui.icons.receipt-long-rounded
  "Imports @material-ui/icons/ReceiptLongRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def receipt-long-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14 9.1h-4c-.55 0-1-.45-1-1s.45-1 1-1h4c.55 0 1 .45 1 1s-.45 1-1 1zm0 3h-4c-.55 0-1-.45-1-1s.45-1 1-1h4c.55 0 1 .45 1 1s-.45 1-1 1z"}) (e "path" #js {"d" "M19.5 3.6l-1.15-1.15c-.2-.2-.51-.2-.71 0L16.5 3.6l-1.15-1.15c-.2-.2-.51-.2-.71 0L13.5 3.6l-1.15-1.15c-.2-.2-.51-.2-.71 0L10.5 3.6 9.35 2.46c-.2-.2-.51-.2-.71 0L7.5 3.6 6.43 2.53c-.16-.16-.43-.05-.43.18v13.4H4c-.55 0-1 .45-1 1v2c0 1.66 1.34 3 3 3h12c1.66 0 3-1.34 3-3V2.71c0-.22-.27-.33-.43-.18L19.5 3.6zM19 19.1c0 .55-.45 1-1 1s-1-.45-1-1v-2c0-.55-.45-1-1-1H8v-11h11v14z"}) (e "circle" #js {"cy" "8.1", "r" "1", "cx" "17"}) (e "circle" #js {"cy" "11.1", "r" "1", "cx" "17"}))
                                           "ReceiptLongRounded"))
