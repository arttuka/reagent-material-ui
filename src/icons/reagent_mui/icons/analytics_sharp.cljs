(ns reagent-mui.icons.analytics-sharp
  "Imports @mui/icons-material/AnalyticsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def analytics-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm6 14H7v-5h2v5zm4 0h-2v-3h2v3zm0-5h-2v-2h2v2zm4 5h-2V7h2v10z"})
                                      "AnalyticsSharp"))
