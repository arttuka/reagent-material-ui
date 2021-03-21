(ns reagent-material-ui.icons.signal-cellular-0-bar-rounded
  "Imports @material-ui/icons/SignalCellular0BarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-0-bar-rounded (create-svg-icon (e "path" #js {"d" "M4.41 22H21c.55 0 1-.45 1-1V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71zM20 20H6.83L20 6.83V20z"})
                                                    "SignalCellular0BarRounded"))
