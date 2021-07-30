(ns reagent-material-ui.icons.signal-cellular-off-outlined
  "Imports @material-ui/icons/SignalCellularOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-off-outlined (create-svg-icon (e "path" #js {"d" "m21 1-8.31 8.31 8.31 8.3zM4.91 4.36 3.5 5.77l6.36 6.37L1 21h17.73l2 2 1.41-1.41z"})
                                                   "SignalCellularOffOutlined"))
