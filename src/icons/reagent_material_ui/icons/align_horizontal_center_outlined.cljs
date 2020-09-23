(ns reagent-material-ui.icons.align-horizontal-center-outlined
  "Imports @material-ui/icons/AlignHorizontalCenterOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def align-horizontal-center-outlined (create-svg-icon (e "path" #js {"d" "M11 2h2v5h8v3h-8v4h5v3h-5v5h-2v-5H6v-3h5v-4H3V7h8z"})
                                                       "AlignHorizontalCenterOutlined"))
