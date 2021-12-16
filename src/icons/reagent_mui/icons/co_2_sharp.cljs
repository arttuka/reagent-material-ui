(ns reagent-mui.icons.co-2-sharp
  "Imports @mui/icons-material/Co2Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def co-2-sharp (create-svg-icon (e "path" #js {"d" "M15 9h-5v6h5V9zm-1.5 4.5h-2v-3h2v3zM8 13v2H3V9h5v2H6.5v-.5h-2v3h2V13H8zm10.5 2.5v1h3V18H17v-3.5h3v-1h-3V12h4.5v3.5h-3z"})
                                 "Co2Sharp"))
