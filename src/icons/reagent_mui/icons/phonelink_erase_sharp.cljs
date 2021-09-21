(ns reagent-mui.icons.phonelink-erase-sharp
  "Imports @mui/icons-material/PhonelinkEraseSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def phonelink-erase-sharp (create-svg-icon (e "path" #js {"d" "m13 8.2-1-1-4 4-4-4-1 1 4 4-4 4 1 1 4-4 4 4 1-1-4-4 4-4zM21 1H7v5h2V4h10v16H9v-2H7v5h14V1z"})
                                            "PhonelinkEraseSharp"))
