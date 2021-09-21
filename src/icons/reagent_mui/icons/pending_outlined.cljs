(ns reagent-mui.icons.pending-outlined
  "Imports @mui/icons-material/PendingOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pending-outlined (create-svg-icon [(e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}) (e "circle" #js {"cx" "7", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "12", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "17", "cy" "12", "r" "1.5"})]
                                       "PendingOutlined"))
