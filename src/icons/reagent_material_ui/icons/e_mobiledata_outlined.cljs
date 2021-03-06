(ns reagent-material-ui.icons.e-mobiledata-outlined
  "Imports @material-ui/icons/EMobiledataOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def e-mobiledata-outlined (create-svg-icon (e "path" #js {"d" "M16 9V7H8v10h8v-2h-6v-2h6v-2h-6V9h6z"})
                                            "EMobiledataOutlined"))
