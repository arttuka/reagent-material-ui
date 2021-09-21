(ns reagent-mui.icons.call-received-two-tone
  "Imports @mui/icons-material/CallReceivedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-received-two-tone (create-svg-icon (e "path" #js {"d" "M15 17H8.41L20 5.41 18.59 4 7 15.59V9H5v10h10z"})
                                             "CallReceivedTwoTone"))
