(ns reagent-mui.icons.send-two-tone
  "Imports @mui/icons-material/SendTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def send-two-tone (create-svg-icon [(e "path" #js {"d" "m4 8.25 7.51 1-7.5-3.22zm.01 9.72 7.5-3.22-7.51 1z", "opacity" ".3"}) (e "path" #js {"d" "M2.01 3 2 10l15 2-15 2 .01 7L23 12 2.01 3zM4 8.25V6.03l7.51 3.22-7.51-1zm.01 9.72v-2.22l7.51-1-7.51 3.22z"})]
                                    "SendTwoTone"))
