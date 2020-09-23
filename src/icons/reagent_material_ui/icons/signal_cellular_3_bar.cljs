(ns reagent-material-ui.icons.signal-cellular-3-bar
  "Imports @material-ui/icons/SignalCellular3Bar as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-3-bar (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 7L2 22h15z"}))
                                            "SignalCellular3Bar"))
