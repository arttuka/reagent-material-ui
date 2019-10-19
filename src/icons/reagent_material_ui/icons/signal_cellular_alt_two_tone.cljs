(ns reagent-material-ui.icons.signal-cellular-alt-two-tone
  "Imports @material-ui/icons/SignalCellularAltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-alt-two-tone (create-svg-icon (e "path" #js {"d" "M17 4h3v16h-3V4zM5 14h3v6H5v-6zm6-5h3v11h-3V9z"})
                                                   "SignalCellularAltTwoTone"))
