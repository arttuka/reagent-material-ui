(ns reagent-mui.icons.remove-from-queue-outlined
  "Imports @mui/icons-material/RemoveFromQueueOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def remove-from-queue-outlined (create-svg-icon (e "path" #js {"d" "M21 3H3c-1.11 0-2 .89-2 2v12c0 1.1.89 2 2 2h5v2h8v-2h5c1.1 0 2-.9 2-2V5c0-1.11-.9-2-2-2zm0 14H3V5h18v12zm-5-7v2H8v-2h8z"})
                                                 "RemoveFromQueueOutlined"))
