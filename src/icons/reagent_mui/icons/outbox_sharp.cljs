(ns reagent-mui.icons.outbox-sharp
  "Imports @mui/icons-material/OutboxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def outbox-sharp (create-svg-icon [(e "path" #js {"d" "M11 14h2v-3h3l-4-4-4 4h3z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm16 11h-4.18c-.41 1.16-1.51 2-2.82 2s-2.4-.84-2.82-2H5V5h14v9z"})]
                                   "OutboxSharp"))
