(ns reagent-material-ui.icons.door-front-sharp
  "Imports @material-ui/icons/DoorFrontSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def door-front-sharp (create-svg-icon (e "path" #js {"d" "M19 19V3H5v16H3v2h18v-2h-2zm-4-6h-2v-2h2v2z"})
                                       "DoorFrontSharp"))
