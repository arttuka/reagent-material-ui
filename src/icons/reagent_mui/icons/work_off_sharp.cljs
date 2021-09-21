(ns reagent-mui.icons.work-off-sharp
  "Imports @mui/icons-material/WorkOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def work-off-sharp (create-svg-icon (e "path" #js {"d" "M10 4h4v2h-3.6L22 17.6V6h-6V4c0-1.1-.9-2-2-2h-4c-.98 0-1.79.71-1.96 1.64L10 5.6V4zM3.4 1.84 1.99 3.25 4.74 6H2.01L2 21h17.74l2 2 1.41-1.41z"})
                                     "WorkOffSharp"))
