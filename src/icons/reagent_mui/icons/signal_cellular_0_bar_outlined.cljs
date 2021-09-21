(ns reagent-mui.icons.signal-cellular-0-bar-outlined
  "Imports @mui/icons-material/SignalCellular0BarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-0-bar-outlined (create-svg-icon (e "path" #js {"d" "M2 22h20V2L2 22zm18-2H6.83L20 6.83V20z"})
                                                     "SignalCellular0BarOutlined"))
