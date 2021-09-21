(ns reagent-mui.icons.signal-cellular-off-two-tone
  "Imports @mui/icons-material/SignalCellularOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-off-two-tone (create-svg-icon (e "path" #js {"d" "m21 1-8.31 8.31 8.31 8.3zM4.91 4.36 3.5 5.77l6.36 6.37L1 21h17.73l2 2 1.41-1.41z"})
                                                   "SignalCellularOffTwoTone"))
