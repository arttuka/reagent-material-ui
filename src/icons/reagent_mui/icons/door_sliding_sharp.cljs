(ns reagent-mui.icons.door-sliding-sharp
  "Imports @mui/icons-material/DoorSlidingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def door-sliding-sharp (create-svg-icon (e "path" #js {"d" "M20 19V3h-7.25v16h-1.5V3H4v16H3v2h18v-2h-1zm-10-6H8v-2h2v2zm6 0h-2v-2h2v2z"})
                                         "DoorSlidingSharp"))
