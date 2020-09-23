(ns reagent-material-ui.icons.align-horizontal-right-outlined
  "Imports @material-ui/icons/AlignHorizontalRightOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def align-horizontal-right-outlined (create-svg-icon (e "path" #js {"d" "M20 2h2v20h-2V2zM2 10h16V7H2v3zm6 7h10v-3H8v3z"})
                                                      "AlignHorizontalRightOutlined"))
