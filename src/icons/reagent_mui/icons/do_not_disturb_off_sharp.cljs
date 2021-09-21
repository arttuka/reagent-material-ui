(ns reagent-mui.icons.do-not-disturb-off-sharp
  "Imports @mui/icons-material/DoNotDisturbOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def do-not-disturb-off-sharp (create-svg-icon (e "path" #js {"d" "M17 11v2h-1.17l4.51 4.51C21.39 15.93 22 14.04 22 12c0-5.52-4.48-10-10-10-2.04 0-3.93.61-5.51 1.66L13.83 11H17zM1.39 4.22l2.27 2.27C2.61 8.07 2 9.96 2 12c0 5.52 4.48 10 10 10 2.04 0 3.93-.61 5.51-1.66l2.27 2.27 1.41-1.41L2.81 2.81 1.39 4.22zM7 11h1.17l2 2H7v-2z"})
                                               "DoNotDisturbOffSharp"))
