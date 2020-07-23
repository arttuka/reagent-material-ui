(ns reagent-material-ui.icons.signal-cellular-2-bar
  "Imports @material-ui/icons/SignalCellular2Bar as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-2-bar (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2z", "fillOpacity" ".3"}) (e "path" #js {"d" "M14 10L2 22h12z"}))
                                            "SignalCellular2Bar"))
