(ns reagent-mui.icons.quickreply-sharp
  "Imports @mui/icons-material/QuickreplySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def quickreply-sharp (create-svg-icon [(e "path" #js {"d" "M22 2H2v20l4-4h9v-8h7z"}) (e "path" #js {"d" "M22.5 16h-2.2l1.7-4h-5v6h2v5z"})]
                                       "QuickreplySharp"))
