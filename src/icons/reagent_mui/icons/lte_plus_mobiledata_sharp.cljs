(ns reagent-mui.icons.lte-plus-mobiledata-sharp
  "Imports @mui/icons-material/LtePlusMobiledataSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def lte-plus-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M3 14h3v2H1V8h2v6zm2-4h2v6h2v-6h2V8H5v2zm7 6h5v-2h-3v-1h3v-2h-3v-1h3V8h-5v8zm12-5h-2V9h-2v2h-2v2h2v2h2v-2h2v-2z"})
                                                "LtePlusMobiledataSharp"))
