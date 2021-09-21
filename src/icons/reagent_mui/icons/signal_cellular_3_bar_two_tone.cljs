(ns reagent-mui.icons.signal-cellular-3-bar-two-tone
  "Imports @mui/icons-material/SignalCellular3BarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-3-bar-two-tone (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M2 22h20V2L2 22z"}) (e "path" #js {"d" "M17 7L2 22h15V7z"}))
                                                     "SignalCellular3BarTwoTone"))
