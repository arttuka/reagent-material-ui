(ns reagent-mui.icons.outbox-rounded
  "Imports @mui/icons-material/OutboxRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def outbox-rounded (create-svg-icon [(e "path" #js {"d" "M9.21 11H11v2c0 .55.45 1 1 1s1-.45 1-1v-2h1.79c.45 0 .67-.54.35-.85l-2.79-2.79c-.2-.2-.51-.2-.71 0l-2.79 2.79c-.31.31-.09.85.36.85z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 11h-3.02c-.63 0-1.22.3-1.6.8-.54.73-1.4 1.2-2.38 1.2s-1.84-.47-2.38-1.2c-.38-.5-.97-.8-1.6-.8H5V5h14v9z"})]
                                     "OutboxRounded"))
