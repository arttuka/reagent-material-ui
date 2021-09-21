(ns reagent-mui.icons.stop-sharp
  "Imports @mui/icons-material/StopSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stop-sharp (create-svg-icon (e "path" #js {"d" "M6 6h12v12H6V6z"})
                                 "StopSharp"))
