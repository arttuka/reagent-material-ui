(ns reagent-mui.icons.door-back-sharp
  "Imports @mui/icons-material/DoorBackSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def door-back-sharp (create-svg-icon (e "path" #js {"d" "M19 19V3H5v16H3v2h18v-2h-2zm-8-6H9v-2h2v2z"})
                                      "DoorBackSharp"))
