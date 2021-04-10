(ns reagent-material-ui.icons.signal-cellular-null
  "Imports @material-ui/icons/SignalCellularNull as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-null (create-svg-icon (e "path" #js {"d" "M20 6.83V20H6.83L20 6.83M22 2L2 22h20V2z"})
                                           "SignalCellularNull"))
