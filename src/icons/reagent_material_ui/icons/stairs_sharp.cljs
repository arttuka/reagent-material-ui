(ns reagent-material-ui.icons.stairs-sharp
  "Imports @material-ui/icons/StairsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stairs-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm15 5h-2.42v3.33H13v3.33h-2.58V18H6v-2h2.42v-3.33H11V9.33h2.58V6H18v2z"})
                                   "StairsSharp"))
