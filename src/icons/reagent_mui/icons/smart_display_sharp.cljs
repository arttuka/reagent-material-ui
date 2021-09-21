(ns reagent-mui.icons.smart-display-sharp
  "Imports @mui/icons-material/SmartDisplaySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def smart-display-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM9.5 16.5v-9l7 4.5-7 4.5z"})
                                          "SmartDisplaySharp"))
