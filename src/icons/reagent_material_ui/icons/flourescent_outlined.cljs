(ns reagent-material-ui.icons.flourescent-outlined
  "Imports @material-ui/icons/FlourescentOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flourescent-outlined (create-svg-icon (e "path" #js {"d" "M5 15h14V9H5v6zm2-4h10v2H7v-2zm4-9h2v3h-2zm6.2863 4.3989l1.7897-1.8024 1.4192 1.4092-1.7897 1.8024zM11 19h2v3h-2zm6.29-1.29l1.79 1.8 1.42-1.42-1.8-1.79zM3.4947 6.0091L4.902 4.602l1.789 1.789-1.4074 1.407zm-.0026 12.0672l1.8024-1.7897 1.4092 1.4192-1.8023 1.7897z"})
                                           "FlourescentOutlined"))