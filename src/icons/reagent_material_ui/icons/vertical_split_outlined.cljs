(ns reagent-material-ui.icons.vertical-split-outlined
  "Imports @material-ui/icons/VerticalSplitOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-split-outlined (create-svg-icon (e "path" #js {"d" "M3 13h8v2H3zm0 4h8v2H3zm0-8h8v2H3zm0-4h8v2H3zm16 2v10h-4V7h4m2-2h-8v14h8V5z"})
                                              "VerticalSplitOutlined"))
