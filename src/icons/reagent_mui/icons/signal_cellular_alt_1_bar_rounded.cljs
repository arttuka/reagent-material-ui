(ns reagent-mui.icons.signal-cellular-alt-1-bar-rounded
  "Imports @mui/icons-material/SignalCellularAlt1BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-alt-1-bar-rounded (create-svg-icon (e "path" #js {"d" "M6.5 20c-.83 0-1.5-.67-1.5-1.5v-3c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v3c0 .83-.67 1.5-1.5 1.5z"})
                                                        "SignalCellularAlt1BarRounded"))
