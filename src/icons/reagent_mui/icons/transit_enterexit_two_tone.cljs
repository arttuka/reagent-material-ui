(ns reagent-mui.icons.transit-enterexit-two-tone
  "Imports @mui/icons-material/TransitEnterexitTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def transit-enterexit-two-tone (create-svg-icon (e "path" #js {"d" "M15.98 6 9 12.77V8H6v10h10v-3h-4.85L18 8.03z"})
                                                 "TransitEnterexitTwoTone"))
