(ns reagent-mui.icons.roller-shades-closed
  "Imports @mui/icons-material/RollerShadesClosed as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roller-shades-closed (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h8.25c0 .97.78 1.75 1.75 1.75s1.75-.78 1.75-1.75H22v-2h-2zM6 19v-2h5v2H6zm7 0v-2h5v2h-5z"})
                                           "RollerShadesClosed"))
