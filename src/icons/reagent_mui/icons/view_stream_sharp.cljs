(ns reagent-mui.icons.view-stream-sharp
  "Imports @mui/icons-material/ViewStreamSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-stream-sharp (create-svg-icon (e "path" #js {"d" "M3 19v-6h18v6H3zM3 5v6h18V5H3z"})
                                        "ViewStreamSharp"))
