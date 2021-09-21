(ns reagent-mui.icons.signal-cellular-null-outlined
  "Imports @mui/icons-material/SignalCellularNullOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-null-outlined (create-svg-icon (e "path" #js {"d" "M20 6.83V20H6.83L20 6.83M22 2 2 22h20V2z"})
                                                    "SignalCellularNullOutlined"))
