(ns reagent-mui.icons.eject-sharp
  "Imports @mui/icons-material/EjectSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def eject-sharp (create-svg-icon (e "path" #js {"d" "M5 17h14v2H5v-2zm7-12L5.33 15h13.34L12 5z"})
                                  "EjectSharp"))
