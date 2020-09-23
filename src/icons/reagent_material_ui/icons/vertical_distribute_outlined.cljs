(ns reagent-material-ui.icons.vertical-distribute-outlined
  "Imports @material-ui/icons/VerticalDistributeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-distribute-outlined (create-svg-icon (e "path" #js {"d" "M22 2v2H2V2h20zM7 10.5v3h10v-3H7zM2 20v2h20v-2H2z"})
                                                   "VerticalDistributeOutlined"))
