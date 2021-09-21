(ns reagent-mui.icons.signal-cellular-1-bar-outlined
  "Imports @mui/icons-material/SignalCellular1BarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-1-bar-outlined (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M2 22h20V2L2 22z"}) (e "path" #js {"d" "M12 12L2 22h10V12z"}))
                                                     "SignalCellular1BarOutlined"))
