(ns reagent-material-ui.icons.align-horizontal-right-sharp
  "Imports @material-ui/icons/AlignHorizontalRightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def align-horizontal-right-sharp (create-svg-icon (e "path" #js {"d" "M20 2h2v20h-2V2zM2 10h16V7H2v3zm6 7h10v-3H8v3z"})
                                                   "AlignHorizontalRightSharp"))
