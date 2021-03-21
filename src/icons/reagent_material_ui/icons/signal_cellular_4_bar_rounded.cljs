(ns reagent-material-ui.icons.signal-cellular-4-bar-rounded
  "Imports @material-ui/icons/SignalCellular4BarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-4-bar-rounded (create-svg-icon (e "path" #js {"d" "M4.41 22H21c.55 0 1-.45 1-1V4.41c0-.89-1.08-1.34-1.71-.71L3.7 20.3c-.62.63-.18 1.7.71 1.7z"})
                                                    "SignalCellular4BarRounded"))
