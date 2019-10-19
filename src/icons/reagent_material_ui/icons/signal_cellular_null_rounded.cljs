(ns reagent-material-ui.icons.signal-cellular-null-rounded
  "Imports @material-ui/icons/SignalCellularNullRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-null-rounded (create-svg-icon (e "path" #js {"d" "M20 6.83V19c0 .55-.45 1-1 1H6.83L20 6.83m.29-3.12L3.71 20.29c-.63.63-.19 1.71.7 1.71H20c1.1 0 2-.9 2-2V4.41c0-.89-1.08-1.33-1.71-.7z"})
                                                   "SignalCellularNullRounded"))
