(ns reagent-mui.icons.signal-cellular-alt-2-bar-outlined
  "Imports @mui/icons-material/SignalCellularAlt2BarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-alt-2-bar-outlined (create-svg-icon (e "path" #js {"d" "M5 14h3v6H5v-6zm6-5h3v11h-3V9z"})
                                                         "SignalCellularAlt2BarOutlined"))
