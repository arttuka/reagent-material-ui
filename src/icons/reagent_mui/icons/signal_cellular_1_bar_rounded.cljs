(ns reagent-mui.icons.signal-cellular-1-bar-rounded
  "Imports @mui/icons-material/SignalCellular1BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-1-bar-rounded (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M4.41 22H20c1.1 0 2-.9 2-2V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71z"}) (e "path" #js {"d" "M12 12l-8.29 8.29c-.63.63-.19 1.71.7 1.71H12V12z"}))
                                                    "SignalCellular1BarRounded"))
