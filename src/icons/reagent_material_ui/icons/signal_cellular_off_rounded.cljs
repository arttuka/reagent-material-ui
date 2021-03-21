(ns reagent-material-ui.icons.signal-cellular-off-rounded
  "Imports @material-ui/icons/SignalCellularOffRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-off-rounded (create-svg-icon (e "path" #js {"d" "M20.29 3.71l-6.88 6.88L22 19.17V4.41c0-.89-1.08-1.33-1.71-.7zm-17.19.8c-.39.39-.39 1.02 0 1.41l7.49 7.49-6.88 6.88c-.63.63-.19 1.71.7 1.71h14.76l.9.9c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L4.51 4.51a.9959.9959 0 0 0-1.41 0z"})
                                                  "SignalCellularOffRounded"))
