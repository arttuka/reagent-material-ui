(ns reagent-mui.icons.grid-view-sharp
  "Imports @mui/icons-material/GridViewSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def grid-view-sharp (create-svg-icon (e "path" #js {"d" "M3 3h8v8H3zm0 10h8v8H3zM13 3h8v8h-8zm0 10h8v8h-8z"})
                                      "GridViewSharp"))
