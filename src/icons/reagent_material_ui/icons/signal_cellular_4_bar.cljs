(ns reagent-material-ui.icons.signal-cellular-4-bar
  "Imports @material-ui/icons/SignalCellular4Bar as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-4-bar (create-svg-icon (e "path" #js {"d" "M2 22h20V2z"})
                                            "SignalCellular4Bar"))
