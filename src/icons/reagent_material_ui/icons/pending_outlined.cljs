(ns reagent-material-ui.icons.pending-outlined
  "Imports @material-ui/icons/PendingOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def pending-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "7"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "12"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "17"}))
                                       "PendingOutlined"))
