(ns reagent-mui.icons.output-sharp
  "Imports @mui/icons-material/OutputSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def output-sharp (create-svg-icon [(e "path" #js {"d" "m17 17 5-5-5-5-1.41 1.41L18.17 11H9v2h9.17l-2.58 2.59z"}) (e "path" #js {"d" "M19 19H5V5h14v2h2V3H3v18h18v-4h-2z"})]
                                   "OutputSharp"))
