(ns reagent-material-ui.icons.signal-cellular-0-bar-outlined
  "Imports @material-ui/icons/SignalCellular0BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-0-bar-outlined (create-svg-icon (e "path" #js {"d" "M2 22h20V2L2 22zm18-2H6.83L20 6.83V20z"})
                                                     "SignalCellular0BarOutlined"))
