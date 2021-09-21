(ns reagent-mui.icons.remove-sharp
  "Imports @mui/icons-material/RemoveSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def remove-sharp (create-svg-icon (e "path" #js {"d" "M19 13H5v-2h14v2z"})
                                   "RemoveSharp"))
