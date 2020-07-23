(ns reagent-material-ui.icons.more-outlined
  "Imports @material-ui/icons/MoreOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def more-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 3H7c-.69 0-1.23.35-1.59.88L0 12l5.41 8.11c.36.53.97.89 1.66.89H22c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H7.07L2.4 12l4.66-7H22v14z"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "9"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "14"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "19"}))
                                    "MoreOutlined"))
