(ns reagent-mui.icons.system-update-sharp
  "Imports @mui/icons-material/SystemUpdateSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-update-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 18H7V5h10v14zm-1-6h-3V8h-2v5H8l4 4 4-4z"})
                                          "SystemUpdateSharp"))
