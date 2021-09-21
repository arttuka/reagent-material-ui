(ns reagent-mui.icons.straighten-sharp
  "Imports @mui/icons-material/StraightenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def straighten-sharp (create-svg-icon (e "path" #js {"d" "M23 6H1v12h22V6zm-2 10H3V8h2v4h2V8h2v4h2V8h2v4h2V8h2v4h2V8h2v8z"})
                                       "StraightenSharp"))
