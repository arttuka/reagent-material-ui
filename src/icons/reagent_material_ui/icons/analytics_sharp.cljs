(ns reagent-material-ui.icons.analytics-sharp
  "Imports @material-ui/icons/AnalyticsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def analytics-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm6 14H7v-5h2v5zm4 0h-2v-3h2v3zm0-5h-2v-2h2v2zm4 5h-2V7h2v10z"})
                                      "AnalyticsSharp"))
