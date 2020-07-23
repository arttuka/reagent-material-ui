(ns reagent-material-ui.icons.signal-cellular-null-outlined
  "Imports @material-ui/icons/SignalCellularNullOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-null-outlined (create-svg-icon (e "path" #js {"d" "M20 6.83V20H6.83L20 6.83M22 2L2 22h20V2z"})
                                                    "SignalCellularNullOutlined"))
