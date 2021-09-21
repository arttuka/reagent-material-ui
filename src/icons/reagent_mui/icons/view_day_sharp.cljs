(ns reagent-mui.icons.view-day-sharp
  "Imports @mui/icons-material/ViewDaySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-day-sharp (create-svg-icon (e "path" #js {"d" "M2 21h19v-3H2v3zM21 8H2v8h19V8zM2 3v3h19V3H2z"})
                                     "ViewDaySharp"))
