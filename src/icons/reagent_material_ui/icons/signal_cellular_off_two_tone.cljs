(ns reagent-material-ui.icons.signal-cellular-off-two-tone
  "Imports @material-ui/icons/SignalCellularOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-off-two-tone (create-svg-icon (e "path" #js {"d" "M21 1l-8.31 8.31 8.31 8.3zM4.91 4.36L3.5 5.77l6.36 6.37L1 21h17.73l2 2 1.41-1.41z"})
                                                   "SignalCellularOffTwoTone"))
