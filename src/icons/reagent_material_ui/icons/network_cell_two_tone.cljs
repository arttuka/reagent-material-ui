(ns reagent-material-ui.icons.network-cell-two-tone
  "Imports @material-ui/icons/NetworkCellTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def network-cell-two-tone (create-svg-icon (e "path" #js {"d" "M2 22h20V2L2 22zm18-2h-3V9.83l3-3V20z"})
                                            "NetworkCellTwoTone"))
