(ns reagent-material-ui.icons.signal-cellular-3-bar-sharp
  "Imports @material-ui/icons/SignalCellular3BarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-3-bar-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M2 22h20V2L2 22z"}) (e "path" #js {"d" "M17 7L2 22h15V7z"}))
                                                  "SignalCellular3BarSharp"))
