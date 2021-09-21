(ns reagent-mui.icons.brunch-dining-sharp
  "Imports @mui/icons-material/BrunchDiningSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def brunch-dining-sharp (create-svg-icon (e "path" #js {"d" "M18 8h2V4h-2v4zm-2 14H2v-2h14v2zm2-6.11-.4-.42c-1.02-1.08-1.6-2.52-1.6-4V2h6v9.51c0 1.46-.54 2.87-1.53 3.94l-.47.52V20h2v2h-4v-6.11zM7 16v-2h4v2h5v2H2v-2h5z"})
                                          "BrunchDiningSharp"))
