(ns reagent-material-ui.icons.no-cell-sharp
  "Imports @material-ui/icons/NoCellSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-cell-sharp (create-svg-icon (e "path" #js {"d" "M21.19 21.19L2.81 2.81 1.39 4.22 5 7.83V23h14v-1.17l.78.78 1.41-1.42zM7 18V9.83L15.17 18H7zM8.83 6L5 2.17V1h14v15.17l-2-2V6H8.83z"})
                                    "NoCellSharp"))
