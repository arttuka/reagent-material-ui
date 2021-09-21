(ns reagent-mui.icons.add-to-queue-sharp
  "Imports @mui/icons-material/AddToQueueSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-to-queue-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v16h7v2h8v-2h7V3zm-2 14H3V5h18v12zm-5-7v2h-3v3h-2v-3H8v-2h3V7h2v3h3z"})
                                         "AddToQueueSharp"))
