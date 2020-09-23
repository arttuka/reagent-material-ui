(ns reagent-material-ui.icons.signal-cellular-1-bar-outlined
  "Imports @material-ui/icons/SignalCellular1BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-1-bar-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M12 12L2 22h10V12z"}))
                                                     "SignalCellular1BarOutlined"))
