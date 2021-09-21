(ns reagent-mui.icons.signal-cellular-0-bar
  "Imports @mui/icons-material/SignalCellular0Bar as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-0-bar (create-svg-icon (e "path" #js {"d" "M20 6.83V20H6.83L20 6.83M22 2 2 22h20V2z"})
                                            "SignalCellular0Bar"))
