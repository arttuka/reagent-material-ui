(ns reagent-mui.icons.call-missed-sharp
  "Imports @mui/icons-material/CallMissedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-missed-sharp (create-svg-icon (e "path" #js {"d" "M19.59 7 12 14.59 6.41 9H11V7H3v8h2v-4.59l7 7 9-9L19.59 7z"})
                                        "CallMissedSharp"))
